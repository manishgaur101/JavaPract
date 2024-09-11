package com.Array;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeStringArray {
    public static void main(String[] args) {
        String[] a = {"manish","gaur","manish"};
        String[] b = {"india","usa","usa","gaur"};

        //merging array
        String[] c = Stream.concat(Arrays.stream(a),Arrays.stream(b)).toArray(String[]::new);
        System.out.println(Arrays.toString(c));
    }
}
