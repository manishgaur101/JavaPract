package com.string;

import java.util.stream.Collectors;
import java.util.*;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String s = "abcdbdfghab";
        System.out.println("Given String: "+s);
        findDuplicateCharJava7(s);
    }

    public static void findDuplicateCharJava8(String s){
        Map<Character, Long> iMap = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        iMap.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .forEach(entry ->System.out.println(entry.getKey()));
    }

    public static void findDuplicateCharJava7(String s){
        Map<Character, Integer> iMap =  new HashMap<>();
        for(char c : s.toCharArray()){
            if(iMap.containsKey(c)){
                iMap.put(c,iMap.get(c)+1);
            }
            else{
                iMap.put(c,1);
            }
        }
        System.out.println("Below are duplicate characters: ");
        for(Map.Entry<Character,Integer> entry : iMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}

