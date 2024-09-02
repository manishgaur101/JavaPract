package com.Array;

import java.util.Arrays;

public class StringArrayToIntArray {
    public static void main(String[] args){
        String[] s = {"10","20","30","40"};
        int[] arr = new int[s.length];
        for(int i=0; i<s.length; i++){
            arr[i] =  Integer.parseInt(s[i]);
        }
        System.out.print(Arrays.toString(arr));
    }
}
