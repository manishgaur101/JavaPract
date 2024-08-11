package com.starpattern;

public class CrossStarPattern {
    public static void main(String[] args) {
        printCrossStar(10);
    }

    private static void printCrossStar(int rows) {
        for (int i = 1; i <= rows ; i++) {
            for (int k = 0; k < i-1 ; k++) {
                System.out.print(" ");
            }
            if(i==rows){
                System.out.print("*");
            }
            else {
                System.out.print("*");
                for (int m = 0; m < rows+rows-i*2 ; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < rows ; i++) {
            for (int k = 0; i>0 && k < rows-i-1 ; k++) {
                System.out.print(" ");
            }
            if(i!=0) {
                System.out.print("*");
                for (int m = 0; m < i*2 ; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

        }

    }
}
