package com.starpattern;

public class RightPascalTriangle {
    public static void main(String[] args) {
        printRightPascal(11);
    }

    private static void printRightPascal(int rows) {
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < rows ; i++) {
            for (int j = 1; i>0 && j <= rows-i  ; j++) {
                System.out.print("*");
            }
            if (i!=0 ) System.out.println();
        }


    }
}
