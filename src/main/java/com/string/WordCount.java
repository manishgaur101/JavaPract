package com.string;

import java.util.*;
import java.util.stream.*;

/**
 * Program to find word count in a String and find duplicate and unique word.
 */
public class WordCount {
    public static void main(String[] args){
        String s = "My Name is Manish, I live in bikaner, I am fine.";
        wordCount(s);
    }

    public static void wordCount(String s){
        Map<String,Long> iMap = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));

        //print word Count for each word
        iMap.forEach((k,v)-> System.out.println(k+":"+v));

        //Duplicate Words
        System.out.println("Duplicate words:");
        iMap.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .forEach(entry-> System.out.println(entry.getKey()));

        //Unique words
        System.out.println("Unique words:");
        iMap.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .forEach(entry-> System.out.println(entry.getKey()));

        //Printing String after removing Duplicate
        System.out.println("Printing string after removing duplicates:");
        for(Map.Entry<String,Long> entry : iMap.entrySet()){
            System.out.print(entry.getKey()+" ");
        }

    }
}
