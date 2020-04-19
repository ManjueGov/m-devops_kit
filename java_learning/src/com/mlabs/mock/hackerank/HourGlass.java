package com.mlabs.mock.hackerank;

import java.util.Scanner;

public class HourGlass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                System.out.print(arr[i][j]);
            }
        }
        scanner.close();
    }
}
