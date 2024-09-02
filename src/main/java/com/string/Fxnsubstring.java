package com.string;

/**
 * substring(int beginIndex, int endIndex)
 * endIndex - exclusive and optional
 */
public class Fxnsubstring {
    public static void main(String[] args){
        String str = "JavaConcepts";
        String str1 = str.substring(0,4); // fetch from 0 to 3 index as last is exclusive.
        String str2 = str.substring(4,str.length());
        System.out.println(str1);
        System.out.println(str2);
    }
}
