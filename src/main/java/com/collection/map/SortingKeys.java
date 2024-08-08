package com.collection.map;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingKeys {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 98);
        map.put("Data Structure", 85);
        map.put("Database", 91);
        map.put("Java", 95);
        map.put("Operating System", 79);
        map.put("Networking", 80);
        System.out.println(map);

        //for sorting based on key we can use TreeMap using java7
        Map<String, Integer> treeMap =  new TreeMap<>(map);
        System.out.println(treeMap); // Natural order sorting based on key will happen

        //sorting keys in descending order using java7
        // Create a TreeMap with a custom comparator for descending order
        Map<String, Integer> reverseTreeMap =  new TreeMap<>(Comparator.reverseOrder());
        reverseTreeMap.putAll(map);
        System.out.println(reverseTreeMap);

        //Sorting keys in ascending order using Java8
        System.out.println("--------------Using Java8-------------");
        Map<String,Integer> ascSorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)->k,LinkedHashMap::new));
        System.out.println("Key Ascending sorted:"+ ascSorted);


        //Sorting keys in descending order using java8
        Map<String,Integer> descSorted = map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)->k,LinkedHashMap::new));
        System.out.println("Key Descending sorted:"+ descSorted);
    }
}
