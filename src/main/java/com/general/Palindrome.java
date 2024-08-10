package com.general;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please provide input for Palindrome checking: ");
        Scanner input = new Scanner(System.in);
        String inputData = input.nextLine();

        // We can not compare String and String builder with equals() coz String class has overriden this method but StringBuilder not.
        //StringBuilder reverseInputData = new StringBuilder(inputData).reverse();

        String reverseInput = new StringBuilder(inputData).reverse().toString();
        System.out.println(inputData.equals(reverseInput) ? inputData+" is a Palindrome." : inputData+" is not a Palindrome.");

    }
}
