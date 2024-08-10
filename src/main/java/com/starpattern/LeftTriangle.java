package com.starpattern;

public class LeftTriangle {
    public static void main(String[] args) {
        printLeftTriangle(10);
    }
    public static void printLeftTriangle(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int k = 0; k < rows-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
