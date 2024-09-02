package com.special;

import java.util.*;
import java.util.stream.*;

public class DuplicateWordFinderString {
    public static void main(String[] args){
        String s = "Manish is great, manish is a good tester, manish is a good friend";

        Arrays.stream(s.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                        .filter(entry->entry.getValue()>1)
                .forEach(entry->System.out.println(entry));


    }
}
