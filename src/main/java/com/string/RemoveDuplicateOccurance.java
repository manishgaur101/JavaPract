package com.string;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateOccurance {
    public static void main(String[] args) {
        // Remove Duplicate from String
        String s =  "ManishGaur";
        //expected = ManishGur

        System.out.println(s);

        usingJava7(s);
    }

    public static void usingJava7(String s){
        Map<Character,Integer> iMap =  new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            if(iMap.containsKey(c)){
                iMap.put(c,iMap.get(c)+1);
            }
            else{
                iMap.put(c,1);
            }
        }

        //print the key this will print only unique chars
        for(Map.Entry<Character,Integer> maap : iMap.entrySet())
        {
            System.out.print(maap.getKey());
        }
    }
    public static void usingJava8(String s){
         s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()))
                .forEach((k,v)->System.out.print(k));
    }
}
