package com.dsa.techniques.bruteforce;

import java.util.*;

/**
 * Program to find all possible palindrome from String
 * using technique - BruteForce
 */
public class AllPalindromesBruteForce {

    private static boolean isPalindrome(String s){
        int left =  0;
        int right =  s.length()-1;
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static Set<String> findAllPalin(String s){
        Set<String> palindromes =  new LinkedHashSet<>();
        for(int i = 0; i< s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String subStr = s.substring(i,j);
                if(isPalindrome(subStr)){
                    palindromes.add(subStr);
                }
            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        String s = "ababa";

        //get all palindromes
        Set<String> palindromes = findAllPalin(s);
        //print all palindromes
        System.out.println(palindromes);

    }
}
