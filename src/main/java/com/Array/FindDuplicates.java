package com.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] runs = {2,3,4,6,7,8,9,0,1,2,3,8,4};
        System.out.printf("Given array is:%s\n", Arrays.toString(runs));
        Set<Integer> result  = findDuplicate(runs);
        System.out.printf("Dulicates are:%s\n",result);

    }

    public static Set<Integer> findDuplicate(int[] a){
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int i : a) {
            if(!unique.add(i))
                duplicate.add(i);
        }


        return duplicate;
    }
}
