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

        //---------------------
        /**Below will give error coz Size cannot be changes when
         *List is made of Arrays.asList();
         * But we can make modifiable array like this
         * List<String> list = new ArrayList<>(Arrays.asList("Kaynat","Khan"));
         */
        /*System.out.println(mergeList(
           Arrays.asList("Manish","Kumar"),
            Arrays.asList("Manish","Gaur")
            ));*/
        /**
         * Below are two ways to ADD Items in a list.
         * 1. by add() function
         * 2. by Collections.addAll(listname,"data1","data2")
         */
        List<String> listA = new ArrayList<>();
        listA.add("Manish");
        listA.add("Kumar");

        /**
         * Second way to add data in a List-- Preety Cool! hmmm
         */
        Collections.addAll(listA,"Gaur","Neha","Gaur");

        /**Since we are merging in list1 so second list we can send
         *Arrays.asList();
         */
        System.out.println(mergeList(
                listA,
                Arrays.asList("Manish","Gaur")
        ));

    }

    /**
     * Function to merge two lists.
     */
    public static List<String> mergeList(List<String> list1, List<String> list2){
        list1.addAll(list2);
        return list1;
    }
}
