package com.collection;

import java.util.*;

public class ConvertCollectionToIntegerArray {
    public static void main(String[] args) {
        /**
         * toArray() method of Collection(I) convert into Object[]
         * If we want to convert into any specific type of primitive we can
         * just do like below.
         */

        //=================converting Set into Integer[]============================
        int[] s = {10,2,3,6,9,12,55,2};
        System.out.println(Arrays.toString(s));
        SortedSet<Integer> sorts =  new TreeSet<>();
        for(int a : s){
            sorts.add(a);
        }
        Integer [] b = sorts.toArray(new Integer[0]); //Defining the Integer[] default size 0
        System.out.println(Arrays.toString(b));

        //=================converting List into Integer[]============================
        List<Integer> list = new ArrayList<>();
        for(int c : s){
            list.add(c);
        }
        Integer[] c =  list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(c));


    }
}
