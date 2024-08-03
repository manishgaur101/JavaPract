package com.collection.list;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        //Declaring a List of String
        List<String> sList = new ArrayList<>();

        //Adding elements in list
        Collections.addAll(sList,"abraham","vivian","pasha","ramdin","gabrial","abraham","steve","andrew");
        Collections.addAll(sList,"vivian","ramdin");

        // Printing list elements
        System.out.println("Given List:-------- ");
        System.out.println(sList);

        //Removing duplicates
        Set<String> setPlayers =  new LinkedHashSet<>(sList);

        sList = setPlayers.stream()
                .collect(Collectors.toList());

        System.out.printf("\nList after removing duplicates:--------- \n%s\n",sList);





    }
}
