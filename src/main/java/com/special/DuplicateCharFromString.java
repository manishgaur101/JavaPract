package com.special;

import java.util.stream.Collectors;
import java.util.*;

public class DuplicateCharFromString {
    public static void main(String[] str){
        String s = "amazing";
        System.out.println("Duplicate chars are: ");
        Map<Character,Long> iMap = s.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        iMap.entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}
