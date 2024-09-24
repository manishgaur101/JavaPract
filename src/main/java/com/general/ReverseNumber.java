package com.general;

public class ReverseNumber {

    public static int reverseNumber(int n){
        int c =  0;
        while(n > 0){
            int digit = n % 10; // Gives the last digit
            c =  c * 10 + digit; // append the digit to the c
            n /= 10; // Remove the last digit from the n
        }
        return c;
    }

    public static void main(String[] args){
        int n = 123;
        int reverse = reverseNumber(n);
        System.out.println("Given: "+n);

        System.out.println("Reversed Number is: "+reverse);
    }
}
