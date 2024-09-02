package com.collection.map;


import java.util.*;
import java.util.stream.Collectors;

public class SortingValuesMap {
    public static void main(String[] args) {

        System.out.println("Sorting Map based on Values:");
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);
        System.out.println("Given Map: "+map);

        //Ascending Order using Java7
        List<Map.Entry<String, Integer>> entrysetList =  new ArrayList<>(map.entrySet());
        entrysetList.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entrysetList) {
            linkedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Ascending Order: "+linkedMap);

        //Ascending Order using Java8
        Map<String,Integer> ascSortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue())
                .collect(Collectors.toMap(  Map.Entry::getKey,
                                            Map.Entry::getValue,
                                            (k,v)->k,LinkedHashMap::new));
        //.forEach((k,v)->System.out.println("Key:"+k+" ,Value: "+v));
        System.out.println("Ascending Order: "+ascSortedMap);

        //Descending order using Java8
        Map<String,Integer> descSortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                                          Map.Entry::getValue,
                                          (k,v)->k,LinkedHashMap::new));
                //.forEach((k,v)->System.out.println("Key:"+k+" ,Value: "+v));
        System.out.println("Descending Order: "+descSortedMap);




    }
}
