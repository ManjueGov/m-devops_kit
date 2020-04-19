terraform {
  required_version = ">= 0.12.0"
}

provider "aws" {
  access_key = "${var.AWS_ACCESS_KEY_ID}"
  secret_key = "${var.AWS_SECRET_ACCESS_KEY}"
  region     = "${var.AWS_DEFAULT_REGION}"
}

data "aws_availability_zones" "available" {}

/*
* Calling modules who create the initial AWS VPC
* and AWS IAM Roles for Kubernetes Deployment
*/

module "aws-vpc" {
  source = "./modules/vpc"

  aws_cluster_name         = "${var.aws_cluster_name}"
  aws_vpc_cidr_block       = "${var.aws_vpc_cidr_block}"
  aws_avail_zones          = "${slice(data.aws_availability_zones.available.names, 0, 2)}"
  aws_cidr_subnets_private = "${var.aws_cidr_subnets_private}"
  aws_cidr_subnets_public  = "${var.aws_cidr_subnets_public}"
  default_tags             = "${var.default_tags}"
}

module "aws-iam" {
  source = "./modules/iam"

  aws_cluster_name = "${var.aws_cluster_name}"
}

/*
* Create KOPS cluster
*
*/