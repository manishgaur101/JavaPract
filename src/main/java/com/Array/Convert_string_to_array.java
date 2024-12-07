package com.Array;

import java.util.Arrays;

/**
 * Program to fetch all the words from statement which
 * can have multiple spacing.
 * Given - " Java is    a cool   language.  "
 * Expected - [Java,is,a,cool,language]
 */
public class Convert_string_to_array {
    public static void main(String[] args) {
    /** String with multiple spaces **/
    String statement1  = " Java is    a cool   language.  ";
    // Splitting the String into a String[]
    String[] arr_statement1 = statement1.split(" ");
    // Printing the array elements
    System.out.println(Arrays.toString(arr_statement1)); //Not expected output
    System.out.println(Arrays.toString(statement1.trim()
            .replaceAll("[^a-zA-Z0-9\\s]","")
                    .replace(".","")
            .split("\\s+")));
    }
}
