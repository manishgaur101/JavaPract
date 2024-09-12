package com.Array;

import java.util.Arrays;

public class ConvertIntegerArraytoIntArray {
    public static void main(String[] args) {
        Integer[] a = {1,2,4,5,7,8,9,1};
        System.out.println(Arrays.toString(a));
        int[] b =  new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(b));
    }
}
