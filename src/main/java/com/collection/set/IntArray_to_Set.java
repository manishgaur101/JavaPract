package com.collection.set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class IntArray_to_Set {
    public static void main(String[] args) {
     Integer[] a =  {1,2,3,3,2,4,5,6,1};
     int[] b = {1,2,3,3,2,4,5,6,1};
        // Using Arrays.asList() - use for Wrapper classes Array
        LinkedHashSet<Integer> result = new LinkedHashSet<>(Arrays.asList(a));
        System.out.println(result);

        //Using for loop - use with primitive array types
        LinkedHashSet<Integer> output = new LinkedHashSet<>();
        for(int arr : b){
            output.add(arr);
        }

        System.out.println(output);

    }


}
