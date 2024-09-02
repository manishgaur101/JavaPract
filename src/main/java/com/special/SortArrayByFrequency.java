package com.special;

import java.util.*;
import java.util.stream.*;


public class SortArrayByFrequency {
    public static void main(String[] args){
        int[] arr ={100,200,200,300,400,100,1,200,300,500};
        //int[] arr = {4, 5, 6, 5, 4, 3, 2, 4, 2, 2};

        // Count frequencies using a HashMap
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Sort the array based on frequency and then by value if frequencies are equal
        List<Integer> sortedList = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int freqCompare = Long.compare(frequencyMap.get(a), frequencyMap.get(b)); // Sort by frequency descending
                    return freqCompare != 0 ? freqCompare : Integer.compare(a, b); // Sort by value ascending if frequencies are equal
                })
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println("Sorted array based on frequency: " + sortedList);
    }
}
