package com.starpattern;

public class LeftPascalTriangle {
    public static void main(String[] args) {
        printLeftPascalTriangle(10);
    }

    private static void printLeftPascalTriangle(int rows) {
        for (int i = 1; i <= rows ; i++) {
            for (int k = 0; k < rows-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < rows ; i++) {
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; i>0 && j <= rows-i ; j++) {
                System.out.print("*");
            }
            if (i != 0) System.out.println();
        }



    }
}
