package com.collection.map;

import java.util.*;
import java.util.stream.*;

public class HashMapToLinkedHashMap {
    public static void main(String[] args){
        Map<String,Integer> iMap =  new HashMap<>(Map.of("one",1,"two",2,"three",3));

        System.out.println(iMap.entrySet()); // It will come in unpredictable order coz of HashMap

        //converting HashMap to LinkedHashMap with method reference
        Map<String,Integer> linkedMap = iMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)->k,LinkedHashMap::new));
        linkedMap.forEach((k,v)->System.out.println("Key: "+k+ ", Value: "+v)); //This will maintain the insertion order
        System.out.println("---------Key based sorting: Ascending Order---------------");

        //If we want to maintain the sorting then either we can sort that - ascending order key based
        Map<String,Integer> ascSortedMap = iMap.entrySet().stream()
                .sorted((Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue
                ,(k,v)->k,LinkedHashMap::new));
        ascSortedMap.forEach((k,v)->System.out.println("Key: " + k + ", Value: "+v));
        System.out.println("----------Value based sorting: Ascending Order --------------");
        // Sorting based on Value
        Map<String,Integer> ascSortedValueMap =  iMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                                        (k,v)->k,LinkedHashMap::new));
        ascSortedValueMap.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));

        System.out.println("----------Key based sorting: Descending Order--------------");

        //If we want to maintain the sorting then either we can sort that - Descending order key based
        Map<String,Integer> descSortedMap =  iMap.entrySet().stream().
                sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)-> k,LinkedHashMap::new));
        descSortedMap.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));

        System.out.println("----------Value based sorting: Descending Order--------------");
        Map<String,Integer> descValueSortedMap =  iMap.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)->k,LinkedHashMap::new));
        descValueSortedMap.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));
    }
}
