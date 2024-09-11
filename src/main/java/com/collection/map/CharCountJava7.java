package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountJava7 {
    public static void main(String[] args){
        //Find Character count
        String given ="ManishGaur";
        //Expected = "M - 1, a - 2, n - 1, I - 1, s - 1, h - 1, G-1, u -1, r -1";

        Map<Character,Integer> iMap =  new LinkedHashMap<>();
        for(char c : given.toCharArray()){
            if(iMap.containsKey(c)){
                iMap.put(c,iMap.get(c)+1);
            }
            else{
                iMap.put(c,1);
            }
        }

        //Print
        for(Map.Entry<Character,Integer> entry : iMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
