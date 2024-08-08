package com.collection.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Assigning multiple values to a Key in a map
 */
public class KeyWithMultipleValues {
    public static void main(String[] args) {
        Map<String, List<String>> multiMap = new HashMap<>();

        List<String> str1 = Arrays.asList("manish","neha");
        //Using computeIfAbsent
        multiMap.computeIfAbsent("name",k->new ArrayList<>()).addAll(str1);

        System.out.println(multiMap);

        //Using Collectors.groupingBy
        List<String> tempList = new ArrayList<>();
        Collections.addAll(tempList,"usa","australia","dubai");

        multiMap  = Stream.of(new Object[][]
                        {
                                {"country",tempList}
                        }).collect(Collectors.toMap(data-> (String)data[0], data -> (List<String>) data[1]));

        System.out.println(multiMap);


    }
}
