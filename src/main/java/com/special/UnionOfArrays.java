package com.special;

import java.util.*;
import java.util.stream.*;

public class UnionOfArrays {
    public static void main(String[] args){
        int[] a = {10,20,1,2,3};
        int[] b = {1,2,10,40,30};

        //For int array conversion to Collection we should use java stream and if it's String array then we can use
        //new ArrayList<>(Arrays.aslist("value1","value2");

        List<Integer> listA  =  Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> listB  =  Arrays.stream(b)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> union = new LinkedHashSet<>(listA);
        union.addAll(listB);
        System.out.println(union);

    }
}
