package com.general;

public class PalindromeInt {
    public static void main(String [] args){
        int n =  12210;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int num){
        int rev =  reverse(num);
        return num == rev;
    }

    public static int reverse(int num){
        int rev = 0;
        while(num > 0){
            int digit = num %10;
            rev =  rev * 10 + digit;
            num =  num /10;
        }
        return rev;
    }
}
