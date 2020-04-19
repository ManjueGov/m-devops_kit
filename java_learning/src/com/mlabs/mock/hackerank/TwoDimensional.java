package com.mlabs.mock.hackerank;

public class TwoDimensional {

    private static int A;
    public static void main(String[] args) {
        int rowSize = 2;
        int colSize = 4;
        int [][] myArray = new int[rowSize][colSize];
        int count = 0, j = 0;

        for(int i = 0; i < rowSize; i++){
            for(j = 0; j< colSize; j++, count++){
                myArray[i][j] = count;
//                System.out.print(myArray[i][j]);
            }
            System.out.println(myArray[i][j]);
            System.out.println();
        }
    }
}
