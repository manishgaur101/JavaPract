package com.general;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Armstrong number - 153 has 3 digits
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 *
 * 9474 has 4 digits
 * 9^4 + 4^4 + 7^4 + 4^4 =  9474
 *
 * All single-digit numbers are Armstrong numbers because any number raised to the power of 1 is itself.
 *
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a number to check if it's an Armstrong number:\n");

        int data = 0;

        if(input.hasNextInt()) // Go Inside if input number is of int type
        {
            data = input.nextInt();
        }
        else{
            System.out.println("Please enter a number only.");
            return;
        }

        if(isArmstrong(data)){
            System.out.printf("%s is an armstrong number.",data);
        }
        else {
            System.out.printf("%s is not an armstrong number.\n",data);
            return;
        }
        //printArmstrongNumbers(1,data);


        System.out.printf("Is %d an Armstrong number:%s",data,isArm(data));
        printArmstrongNumbers(100,300);

    }

    /**
     * Function to check if input is an armstrong number or not using Java8.
     * @param n
     * @return
     */
    public static boolean isArmstrong(int n){
        String strData = Integer.toString(n);
        int dataLength = strData.length();

        //Line 54 can also be done like -
        /**
         * int sum = numberStr.chars()  // Stream each character (digit)
         *                            .map(Character::getNumericValue)  // Convert each char to its numeric value
         *                            .map(digit -> (int) Math.pow(digit, numDigits))  // Raise each digit to the power of numDigits
         *                            .sum();  // Sum all the results
         */
        int sum  = strData.chars()
                .map(a -> (int)Math.pow(Character.getNumericValue(a),dataLength))
                .sum();

        return sum == n;
    }

    /**
     * Function will print all the armstrong numbers between the start and end arguments.
     * @param start
     * @param end
     */
    public static void printArmstrongNumbers(int start, int end){
        IntStream.rangeClosed(start,end)
                .filter(Armstrong::isArm)
                .forEach(System.out::println);
    }

    /**
     * Method to count the digit in int variable.
     * @param num
     * @return
     */
    public static int countDigit(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = num / 10; // Last value will be removed.
        }
        return count;
    }

    /**
     * Another version of method to check the int is armString number or not.
     * @return
     */
    private static boolean isArm(int n){
        // Find the digit count in input
        int count = 0 ,sum = 0;
        int num = n;
        while (num > 0)
        {
            count++;
            num = num / 10; // Last digit will be removed
        }
        // System.out.println(count);

        // Calculate the sum
        int temp = 0;
        num = n;
        for (int i = 0; i < count; i++) {
            temp = num % 10; // Last digit will be returned.
            sum = sum + (int)Math.pow(temp, count);
            num = num / 10; // Last digit will be removed.
        }

        // Validate and return
        return n == sum;
    }
}

