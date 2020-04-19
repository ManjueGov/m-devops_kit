package com.mlabs.mock.hackerank;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    protected String name;
    private int salary;

    Employee(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    private void setSalary(int salary){
        this.salary = salary;
    }

    int getSalary(){
        return salary;
    }

    /** Print information about an instance of Employee. **/
    void print() {
        if (this.salary == 0) {
            System.err.println("Error: No salary set for " + this.name
                    + "; please set salary and try again.\n");
        } else { // Print employee information
            // Formatter for salary that will add commas between zeroes:
            NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);

            System.out.println("Employee Name: " + this.name
                    + "\nSalary: " + salaryFormat.format(this.salary) + "\n");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Santhosh");
        employee.print();
        employee.setSalary(600000);
        employee.print();
    }
}