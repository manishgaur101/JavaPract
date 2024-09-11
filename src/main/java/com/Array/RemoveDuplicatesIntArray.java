package com.Array;

import java.util.Arrays;

public class RemoveDuplicatesIntArray {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,5,2,6,7,8,6};
        System.out.println("Given Array: "+Arrays.toString(a));
        int[] b = Arrays.stream(a)
                .distinct().toArray();
        System.out.println("Array after removing duplicates: "+ Arrays.toString(b));
    }
}
