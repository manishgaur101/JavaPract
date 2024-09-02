package com.collection.map;

import java.util.*;

public class HashMapToTreeMap {
    public static void main(String[] args){
        Map<String,Integer> iMap =  new HashMap<>(Map.of("one",1,"two",2,"three",3,"four",4));

        //Sort the map based on key ascending order
        Map<String,Integer> ascMap =  new TreeMap<>(iMap);
        System.out.println("Map in ascending order key based:\n"+ascMap);

        //sorting the map based on key descending order
        //Collection.reverseOrder() gives Comparator only so we can also use like
        //Map<String, Integer> reverseTreeMap =  new TreeMap<>(Comparator.reverseOrder());
        Map<String,Integer> descMap = new TreeMap<>(Collections.reverseOrder());
        descMap.putAll(iMap);
        System.out.println("Sorted the map in desceding key order:\n"+descMap);

        //Sorting the map based on value ascending order
        //Treeset sort the values based on key and not by Value so for value sorting do it with java8 stream
        // and so no meaning to save the value then in TreeSet coz it will again sort based on Key So
        //to main order we will save it in LinkedHashMap


        //Sorting the map based on value descending order
        // same as above
    }
}
