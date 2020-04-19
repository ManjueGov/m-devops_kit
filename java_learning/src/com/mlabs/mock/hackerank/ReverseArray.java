package com.mlabs.mock.hackerank;

import java.util.Scanner;

public class ReverseArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}