package com.string;

/**
 * lastIndexOf(String str)
 * Returns the index of the last occurrence of the specified substring.
 */
public class FxnlastIndexOf {
    public static void main(String[] args){
        String s =  "JavaConcepts";
        int lastIndex  = s.lastIndexOf("a");
        System.out.println(lastIndex);
        System.out.println(s.lastIndexOf("Concepts"));
    }
}
