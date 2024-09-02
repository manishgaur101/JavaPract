package com.special;

import java.util.*;
import java.util.stream.*;

public class MapKeySort {
    public static void main(String[] str){
        Map<Integer,String> iMap =  new LinkedHashMap<>(Map.of(102,"apac",105,"emea",101,"hello",100,"java"));
        System.out.println("Given Map is: \n"+iMap);
        Map<Integer,String> sortedMap =  new TreeMap<>(iMap);
        System.out.println("Sorted Map in natural order key: \n"+sortedMap);
        mapSortKeyDesc(iMap);
        System.out.println("Sorted Map in natural order value: ");
        mapSortValueAsc(iMap);
        System.out.println("Sorted Map in Descending order value: ");
        mapSortValueDesc(iMap);
    }

    public static void mapSortKeyDesc(Map<Integer,String> iMap){
        Map<Integer,String> keySortDesc = new TreeMap<>(Collections.reverseOrder());
        keySortDesc.putAll(iMap);
        System.out.println("Sorted Map in descending order key: \n"+keySortDesc);
    }

    public static void mapSortValueAsc(Map<Integer,String> iMap){
        iMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)->k,LinkedHashMap::new))
                .forEach((k,v)->System.out.println("Key: "+k+ ", Value: "+ v));
    }

    public static void mapSortValueDesc(Map<Integer,String> iMap){
        iMap.entrySet().stream()
                .sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (k,v)->k,LinkedHashMap::new))
                .forEach((k,v)->System.out.println("Key: "+k+ ", Value: "+v));
    }
}
