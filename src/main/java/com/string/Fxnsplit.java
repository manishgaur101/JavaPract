package com.string;

import java.util.Arrays;

/**
 * split(String regex)
 * Splits the string into an array based on the provided regular expression.
 */
public class Fxnsplit {
    public static void main(String[] args){
        String s =  "JavaConcepts";
        String[] str =  s.split("C"); // will remove C from output
        System.out.println(Arrays.toString(str));
    }
}
