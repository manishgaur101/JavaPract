package com.general;

import java.util.Random;

public class RandomNumber {

    public static int randomNumberWdRamdomClass(){
        Random rom =  new Random();
        int num =  rom.nextInt(); // Random Number Generate
        return num;

        /**
         * To Generate random number in range
         * 0 inclusive 100 exclusive
         * int num =  rom.nextInt(100);
         */
    }

    public static double randomNumberWdMathClass(){
        // Generate a random double between 0.0 and 1.0
        double randomDouble = Math.random();
        return randomDouble;

        /**
         * Generate random number in range
         * from 0 to 99
         * int randomIntInRange = (int) (Math.random() * 100);
         */

    }
    public static void main(String[] args) {
        System.out.println(randomNumberWdRamdomClass());
        System.out.println(randomNumberWdMathClass());
    }
}
