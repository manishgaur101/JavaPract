package com.dsa.techniques.twopointer;

import java.util.*;

/**
 * Program to find all possible palindromes from String using
 * algo - "Expand around center" with time complaxity  - O(n²)
 */
public class AllPalindrome {

    public static void expandAroundCenter(String s,int left, int right, Set<String> palindromes) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindromes.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static Set<String> findAllPalindromes(String s){
        Set<String> palindromes =  new LinkedHashSet<>();
        for(int i = 0; i < s.length(); i++){
            expandAroundCenter(s,i,i,palindromes);
            }
        return palindromes;
    }

    public static void main(String[] args){
     String input = "ababa";
     Set<String> palindromes = findAllPalindromes(input);

     //print all palindromic strings
     System.out.println("All Palindromic substrings:");
        for(String palindrome : palindromes){
            System.out.println(palindrome);
        }
    }
}
