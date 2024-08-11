package com.starpattern;

public class AlphabeticTriangle {
    public static void main(String[] args) {
        printAlphabeticTriangle(5);
    }

    private static void printAlphabeticTriangle(int rows) {
        char symbol = 'A';
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(symbol);
                symbol++;
            }
            System.out.println();
        }


    }
}
