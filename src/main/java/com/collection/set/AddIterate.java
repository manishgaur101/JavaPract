package com.collection.set;

import java.util.*;
import java.util.stream.Collectors;

public class AddIterate {
    public static void main(String[] args) {
        Set<Integer> sSet =  new HashSet<>();
        Collections.addAll(sSet,1,3,5,3,6,7,8);
        System.out.println("Given Set: "+sSet);

        // Convert Set to List via Constructor
        List<Integer> iList = new ArrayList<>(sSet);
        System.out.println("Set Converted to List: "+iList);

        //Travers Set and Print odd values only
        getOdd(sSet).stream()
                .forEach(System.out::println);

    }
    public static List<Integer> getOdd(Collection<Integer> collection){
        List<Integer> oddList = collection.stream()
                .filter(e -> e%2 != 0)
                .collect(Collectors.toList());
        return oddList;

    }
}
