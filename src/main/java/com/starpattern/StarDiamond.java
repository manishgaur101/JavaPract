package com.starpattern;

public class StarDiamond {
    public static void main(String[] args) {
        printStarDiamond(11);
    }

    private static void printStarDiamond(int rows) {
        for (int i = 1; i <= rows ; i++) {
            for (int k = 0; k < rows-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+i-1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < rows ; i++) {
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; i > 0 && j <= (rows+rows-(i+i)-1)  ; j++) {
                System.out.print("*");
            }
            if(i != 0) System.out.println();
        }
    }

}
