package com.starpattern;

public class HollowRightTriangle {
    public static void main(String[] args) {
        printHollowRightTriangle(10);
    }

    public static void printHollowRightTriangle(int rows){
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i == 1 || i == 2 || i == rows )
                    System.out.print("*");
                else{
                    System.out.print("*");
                    for (int k = 0; k < i-j ; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    break;
                }
            }
            System.out.println();
        }


    }
}
