package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_findnumbers {
    public static void main(String[] args) {
        String text =  "abcd23wi10l0p4  123  ui 22";
        // regex to pick the single digit as a whole unit
        Pattern p = Pattern.compile("\\d+");

        //regex to pick the group of consicutive numbers as a whole number
        //Pattern p = Pattern.compile("\\d+");

        //regex to pick only the individual digit not the digit coming in alphanumeric value
        //Pattern p = Pattern.compile("\\b\\d+\\b");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("Found Number: "+m.group());
        }
    }
}
