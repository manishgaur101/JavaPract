package com.starpattern;

public class CentreTriangle {
    public static void main(String[] args) {

        printCentreTriangle(8);
    }
    public static void printCentreTriangle(int rows){
        for (int i = 1; i <= rows ; i++) {
            for (int k = 0; k < rows-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
