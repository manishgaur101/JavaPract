package com.string;

import java.util.*;

public class AppendCharWithFrequency {
    public static void main(String[] args) {
        String given = "ManishGaur";
        //Expected = "1M2a1n1i1s1h1G2a1u1r";

        //Get the map with freq of each char in a String
        Map<Character, Integer> iMap = new LinkedHashMap<>();

        for(Character c : given.toCharArray()){
            if(iMap.containsKey(c)){
                iMap.put(c,iMap.get(c)+1);
            }
            else{
                iMap.put(c,1);
            }
        }

        //Printing
        for(Character c : given.toCharArray()){
            if(iMap.containsKey(c)){
                System.out.print(iMap.get(c));
                System.out.print(c);
            }
        }
    }
}
