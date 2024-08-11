package com.starpattern;

public class SandglassAlphabeticPattern {
    public static void main(String[] args) {
        printSandglassAlphabeticPattern(10);
    }

    private static void printSandglassAlphabeticPattern(int rows) {
    char symbol;
        for (int i = 1; i <= rows ; i++) {
            symbol = 'A';
            for (int k = 0; k < i-1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows-i+1 ; j++) {
                System.out.print(symbol+" ");
                symbol++;
            }
            System.out.println();
        }
        for (int i = 1; i <= rows ; i++) {
            symbol = 'A';
            for (int k = 0; k < rows-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(symbol+" ");
                symbol++;
            }
            System.out.println();
        }
    }
}
