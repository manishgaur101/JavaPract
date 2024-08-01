package com.Array;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurance {
    public static void main(String[] args) {
        int runs[] = {1,2,3,4,4,4,5,6,7,99,1};

        System.out.printf("Given array is: %s", Arrays.toString(runs));
        boolean inst  = (runs instanceof int[])? true:false;
        System.out.println(inst);


        // Using Java8
        Map<Integer, Long> frequencyMap = Arrays.stream(runs)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        frequencyMap.forEach((k,v) -> System.out.println(k +" occurs " + v +" times."));



    }
}
