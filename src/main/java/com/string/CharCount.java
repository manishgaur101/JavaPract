package com.string;

import java.util.*;
import java.util.stream.*;

public class CharCount {
    public static void main(String[] args){
        String str = "india";
        //Applying further operations on collect
        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //Showing the Count of each character in a String
        System.out.println("Character count are: ");
        Map<Character,Long> iMap = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println(iMap);

        //filter only non-duplicate characters
        System.out.println("Unique characters are: ");
        iMap.entrySet().stream()
                .filter(entry-> entry.getValue()==1)
                .map(entry->entry.getKey())
                .forEach(k-> System.out.print(k+" "));
    }
}
