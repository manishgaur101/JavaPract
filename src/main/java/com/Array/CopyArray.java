package com.Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args){
        int[] i = {1,2,3,4};
        String[] s = {"manish","kumar","gaur"};
        char[] c = {'a','b','c'};
        System.out.println("Copied int array: "+ Arrays.toString(copyArray(i)));
        System.out.println("Copied String array: "+ Arrays.toString(copyArray(s)));
    }

    public static int[] copyArray(int[] i){
        int len = i.length;
        int[] k = new int[len];
        for(int a=0;a<i.length;a++){
            k[a] =  i[a];
        }

        return k;
    }

    public static String[] copyArray(String[] i){
        int len = i.length;
        String[] k = new String[len];
        for(int a=0;a<i.length;a++){
            k[a] =  i[a];
        }

        return k;
    }
}
