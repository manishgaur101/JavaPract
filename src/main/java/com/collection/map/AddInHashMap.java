package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddInHashMap {
    public static void main(String[] args) {
        Map<String,Integer> siMap = new HashMap<>();

        //Using Put method
        siMap.put("One", 1);
        siMap.put("Two", 2);
        siMap.put("Three", 3);
        // Contrary to HashTable HashMap allows one null key and n number of null values
        siMap.put(null,null);
        //Map does not allow duplicate keys if you add then old value will be updated
        siMap.put("Two",22);
        System.out.println(siMap);


        //Using putAll method
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(siMap);
        map2.put("Four", 4);

        // Using double braces -- Avoid this as this can have performance implications
        Map<String,Integer> map3 =  new HashMap<>(){{
            put("age",34);
        }};

        //Using Map.of method - immutable map will be created - introduced in java9
        Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);
        //To make it mutable, you can wrap it in a new HashMap:
        Map<String, Integer> mutableMap = new HashMap<>(Map.of("One", 1, "Two", 2, "Three", 3));

        //Using java8 streams
        Map<String, Integer> map8 = Stream.of(new Object[][] {
                { "One", 1 },
                { "Two", 2 },
                { "Three", 3 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));


    }
}
