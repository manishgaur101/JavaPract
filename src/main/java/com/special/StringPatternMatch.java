package com.special;

import java.util.*;
import java.util.regex.*;

public class StringPatternMatch {
    public static void main(String[] args){
        String input = "This is a test string to test pattern mataching test.";
        String input2 = "AAAIIIJJJJAAJJAAAAZZZZAAAAAA";
        String patternToMatch = "test";
        String patternToMatch2 = "AAA";

        //compile the pattern
        Pattern pattern  = Pattern.compile(patternToMatch2);

        //create a matcher to find the pattern in input string
        Matcher matcher = pattern.matcher(input2);

        boolean found = false;
        while(matcher.find()){
            found = true;
            System.out.println("Found match at index: " +matcher.start()+" to "+ matcher.end());
        }

        if(!found){
            System.out.println("No match found.");
        }
    }
}
