package com.string;

/**
 * replace(char oldChar, char newChar)
 * Replaces occurrences of a character with another character.
 */
public class Fxnreplace {
    public static void main(String[] args){
        String s = "hello/123/34/a";
        String newS =  s.replace("/"," "); // all occurance will be replaced
        System.out.println(newS);

        //overloaded method - replace(CharSequence target, CharSequence replacement)
        //Replaces occurrences of a substring with another substring.
        String str = "JavaConcepts";
        String updatedStr =  str.replace("Java","JavaAdvanced");
        System.out.println(updatedStr);

    }
}
