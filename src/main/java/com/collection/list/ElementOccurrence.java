package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementOccurrence {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        Collections.addAll(iList,2,1,1,1,1,2,2,2,2,2,3,4,5,6,0,7,8,9,9,9,0,0,0,0);
        System.out.println("Given List: \n"+iList);

        Map<Integer,Long> iMap = iList.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting())); // e -> e we can also write it like Function.identity()
        iMap.forEach((k,v)->System.out.println(k+" occurs "+ v + " times. "));

        //Find the max Value
        Long maxValue = iMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                        .getValue();
       //System.out.println("Max Value is: "+maxEntry.getValue()+" for key: "+maxEntry.getKey());
        System.out.printf("Maximum value is:%d \n",maxValue);

        // Find all the keys associated with max Value
        iMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(k -> System.out.println("For Key: "+k));




    }
}
