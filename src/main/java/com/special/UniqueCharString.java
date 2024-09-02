package com.special;

import java.util.stream.*;
import java.util.*;

public class UniqueCharString {
    public static void main(String[] str){
        String s = "amazing";
        System.out.println("Non Repeating chars are: ");
        s.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .forEach(entry->System.out.println(entry.getKey()));
    }
}
