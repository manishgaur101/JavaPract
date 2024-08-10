package com.starpattern;

public class HollowRectangle {
    public static void main(String[] args) {
        printHollowRectangle(20);
    }

    public static void printHollowRectangle(int rows){
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows+1 ; j++) {
                if(i==1 || i == rows){
                    System.out.print("*");
                }
                else{
                    System.out.print("*");
                    for (int k = 0; k < rows+1-2; k++) {
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
