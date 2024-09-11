package com.Array;

import java.util.HashSet;
import java.util.Set;

public class ConvertSetIntoStringArray {
    public static void main(String[] args) {
        // Create a Set of Strings
        Set<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");

        // Convert Set to String array
        String[] stringArray = stringSet.toArray(new String[0]);

        // Print the String array
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
