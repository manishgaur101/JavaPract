package com.special;

import java.util.*;
import java.util.stream.*;

public class IntArraytoList {
    public static void main(String[] args){
        int[] a = {10,20};
        List<Integer> aList = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> aSet = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toSet());
    }

}
