package com.special;

import java.util.*;
import java.util.stream.*;

public class StringInputConvert {
    public static void main(String[] arg){
        //So unique char keep as it is and show the count for repeating char in output
        String s = "Automatiooooon";
        //Expected output 2u26m22i66666n

        Map<Character,Long> iMap = s.toLowerCase().chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        Map<Character,Long> duplicateMap =  iMap.entrySet().stream()
                .filter(entry->entry.getValue() >1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));


        System.out.println(iMap);
        for(char c: s.toLowerCase().toCharArray()){
            if(!duplicateMap.containsKey(c)){
                System.out.print(c);
            }
            else{
                System.out.print(duplicateMap.get(c));
            }
        }






    }
}
