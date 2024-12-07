package com.string;

public class PalindromeWithoutStringBuilder {
    /**
     * Using Two pointer in this method.
     * @param s
     * @return
     */
    private static boolean isPalindrome(String s){
        int left =  0; // Will point first index of String
        int right =  s.length()-1; // will point last index of String
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s =  "101";
        System.out.println("Does "+s+ " is palindrome: "+isPalindrome(s) );

    }
}
