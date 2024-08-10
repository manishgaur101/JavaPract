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

        if(input.hasNextInt())
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

    }

    /**
     * Function to check if input is an armstrong number or not.
     * @param n
     * @return
     */
    public static boolean isArmstrong(int n){
        String strData = Integer.toString(n);
        int dataLength = strData.length();
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
                .filter(Armstrong::isArmstrong)
                .forEach(System.out::println);
    }
}
