package com.string;

import java.util.*;
import java.util.regex.*;

public class PatternCheck {
    public static void main(String[] args){
        //Finding pattern present in string or not
        String given  = "IaaLLauimoaaaP";
        String pattern = "aa";
        System.out.print("Match found: "+patternMatcher(given,pattern)+ " times.");
    }

    public static int patternMatcher(String given, String pattern){
        Pattern p =  Pattern.compile(pattern);
        Matcher matcher  = p.matcher(given);

        boolean matchFound = false;
        int count =  0;
        while(matcher.find()){
            matchFound = true;
            count++;
            System.out.println("Found match at index: "+matcher.start()+" to " +matcher.end());
        }
        if(!matchFound){
            System.out.println("No Match found.");
        }
        return count;
    }
}
