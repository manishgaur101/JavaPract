package com.starpattern;

public class DownwardLeftTriangle {
    public static void main(String[] args) {

        printDownwardLeftTriangle(10);
    }
    public static void printDownwardLeftTriangle(int rows){
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
