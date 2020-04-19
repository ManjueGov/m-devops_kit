package com.mlabs.mock.hackerank;

import java.util.Scanner;

public class LetsReview {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        char myChar = 'C';
//        System.out.println("The ASCII value of " + myChar +" is: "+(int) myChar);
        int T = scanner.nextInt();

        for (int j = 1; j <= T; j++) {
            String myString = scanner.next();
            char[] myCharArray = myString.toCharArray();
            for (int i = 0; i < myCharArray.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(myCharArray[i]);
                }
            }
            System.out.print("  ");
            for (int i = 0; i < myCharArray.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(myCharArray[i]);
                }
            }
        }
        System.out.println();
    }
}