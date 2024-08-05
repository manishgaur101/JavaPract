package com.collection.list;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {

        //Using addAll method
        List<String> sList = new LinkedList<>();
        Collections.addAll(sList,"manish","khanak");
        System.out.printf("Given first List:\n%s\n",sList);

        List<String> sList2 = new ArrayList<>();
        Collections.addAll(sList2,"Himank","Khushu");
        System.out.printf("Given second List:\n%s\n",sList2);

        List<String> mergedList = new Vector<>(sList);
        mergedList.addAll(sList2);
        System.out.printf("Merged List:\n%s\n",mergedList);

        //Using java8 Stream
        // Create first list
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));

        // Create second list
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        // Merge lists using streams
        List<Integer> newlist = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        System.out.println("Merged List: " + newlist);

    }
}
