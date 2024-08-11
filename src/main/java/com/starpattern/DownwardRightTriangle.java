package com.starpattern;

public class DownwardRightTriangle {
    public static void main(String[] args) {
        printDownwardRightTriangle(10);
    }

    private static void printDownwardRightTriangle(int rows) {
        for (int i = 1; i <= rows ; i++) {
            for (int k = 0; k < i-1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=rows-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
