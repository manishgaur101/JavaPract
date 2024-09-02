package com.string;

/**
 * replaceAll(String regex, String replacement)
 * replaces each substring of the string that matches the given regular
 * expression (regex) with the specified replacement string.
 */
public class FxnreplaceAll {
    public static void main(String[] args){
        String s = "12/4/5 10:54";
        // Using regular expression to replace all non-word characters with space
        String updateS = s.replaceAll("\\W+"," "); // small w "\\w+" returns all not-word Characters
        System.out.println(updateS);
    }
}
