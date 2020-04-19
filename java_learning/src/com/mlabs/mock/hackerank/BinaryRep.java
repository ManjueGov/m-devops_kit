package com.mlabs.mock.hackerank;

import java.util.Scanner;

public class BinaryRep {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int quo = 0, rem = 0;
        System.out.println("The binary representation of "+n+" is ");
        while (n > 0) {
            if (n % 2 == 1) {
                quo++;
                if (quo > rem) {
                    rem = quo;
                }
            } else {
                quo = 0;
            }
            n = n / 2;
        }
        System.out.print("maximum number of consecutive 1's is "+rem);
        scanner.close();
    }
}