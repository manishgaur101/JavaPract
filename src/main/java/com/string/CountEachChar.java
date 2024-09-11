package com.string;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Program to find all duplicate and unique char in a String.
 */
public class CountEachChar {
    public static void main(String[] args){
        String s =  "Manish Gaur M";
        //Expected char count

        countChar(s);
    }

    public static void countChar(String s){
        Map<Character,Long> iMap = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println(iMap);


        //Find all Duplicate Chars
        System.out.println("Below are all duplicate chars: ");
        iMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry->System.out.println(entry.getKey()));

        //Find all unique chars
        System.out.println("Below are all unique chars: ");
        iMap.entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .forEach(entry -> System.out.println(entry.getKey()));

    }
}
