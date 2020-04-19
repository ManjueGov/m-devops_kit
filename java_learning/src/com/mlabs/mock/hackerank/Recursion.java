package com.mlabs.mock.hackerank;

import java.util.Scanner;

public class Recursion {
    // Multiply 'n' by 'k' using addition:
    private static int nTimesK(int n, int k) {
        System.out.println("n: " + n);
        // Recursive Case
        if(n > 1) {
            return k + nTimesK(n - 1, k);
        }
        // Base Case n = 1
        else {
            return k;
        }
    }

    private static int factorial(int n){
        if(n==1)
            return n;
        if(n==0)
            return 1;
        return factorial(n-1)*n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println("Entered single integer number = "+n);
        int result = factorial(n);
        System.out.println("Factorial("+n+") = "+result);
        scanner.close();
    }
}
