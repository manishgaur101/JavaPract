package com.collection.set;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

/**
 * Set.of() came in java9 to create immutable Set.
 * Duplicates are not allowed, if provided it'll give IllegalArgumentException.
 * Implementation is private class (ImmutableCollections$SetN) - Not HashSet or LinkedHashSet.
 * Null elements not allowed - will throw NullPointerException.
 * Order is not guaranteed.
 *
 */
public class SetToString {
    public static void main(String[] args){
        //Order will not be maintained
        Set<String> set = Set.of("M","a","n","i","s","h");

        //IllegalArgumentException
        //Set<String> set = Set.of("M","a","n","i","s","h","a");

        // If order needs to be maintained
        //Set<String> set = new LinkedHashSet<>(Arrays.asList("M","a","n","i","s","h","a"));

        String s =  String.join("",set);
        System.out.println(s);
    }
}
