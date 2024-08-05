package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveElement {
    public static void main(String[] args) {
        Map<String,String> sMap =  new LinkedHashMap<>();
        sMap.put("name","manish");
        sMap.put("city","boston");
        sMap.put("age","Forty");

        System.out.println("Initial Map: " +sMap);
        System.out.println(sMap.get("name")); //Accessing individual element from map

        System.out.println("Removed value: "+sMap.remove("age"));

        System.out.println("New Map: "+sMap);

    }
}
