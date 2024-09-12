package com.collection.set;

import java.util.*;

public class ExampleSortedSet {
    public static void main(String[] args) {
        int[] i =  {1,3,4,7,1,2,8,4,5};
        String[] s =  {"Manish","Gaur","Manish","Kumar","Amit"};

        //Remove duplicates and Sort it in descending order using Sorted Set
        SortedSet<Integer> ss = new TreeSet<>(Collections.reverseOrder());
        for(int a: i){
            ss.add(a);
        }
        // Remove duplicate and sort in ascending order if Collections sorting not applied on TreeSet.
        System.out.println(ss);

        //In Treeset what ever sorting logic we want to apply just apply at creation level like below
        SortedSet<String> sorts = new TreeSet<>(Comparator.comparingInt(String::length));
        sorts.addAll(Arrays.asList(s));
        System.out.println(sorts);



    }
}
