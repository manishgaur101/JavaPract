package com.special;

import java.util.*;
import java.util.stream.*;

public class IntersectionOfArrays {
    public static void main(String[] args){
        int[] a = {10,20,1,2,3};
        int[] b = {1,2,10,40,30};

        Set<Integer> aSet = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> intersectionSet =  Arrays.stream(b)
                .filter(aSet::contains)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(intersectionSet);
    }
}
