package com.Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeIntArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,2,4,5};
        int [] b = {4,5,6,7};

        System.out.println("Given Array: "+Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();

        System.out.println("Merged Array: "+Arrays.toString(c));
    }
}
