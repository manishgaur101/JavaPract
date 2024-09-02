package com.Array;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Asked in adani industry cloud interview on 02 Sept 2024.
 */
public class MergeIntArrayAndRemoveDuplicate {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,2,3};
        int[] b = {5,6,7,8};
        mergeRemoveDuplicates(a,b);
    }

    public static void mergeRemoveDuplicates(int[] a, int[] b){
        Set<Integer> aSet =  new LinkedHashSet<>();
        //Inserting values from int array to Set using basic for loop
        for(int item : a){
            aSet.add(item);
        }
        //Converting int array to Set using stream
        Set<Integer> bSet = IntStream.of(b)
                .boxed()
                .collect(Collectors.toSet());

        aSet.addAll(bSet);
        System.out.println("Merged values and removed dupliates:\n"+aSet);
    }
}
