package com.mlabs.mock.hackerank;

import java.util.Scanner;

public class Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * ((double) tip_percent / 100);
        double tax = meal_cost * ((double)tax_percent/100);
        double totalCost = (meal_cost + tip + tax);
        System.out.println(totalCost);
        System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();
    }
}
