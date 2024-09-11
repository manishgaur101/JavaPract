package com.Array;

import java.util.Arrays;

public class RotateIntArrayToLeft {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        int n =  6;
        System.out.println("Given array: "+ Arrays.toString(i));
        System.out.println(Arrays.toString(rotateLeft(i,n)));


    }

    public static int[] rotateLeft(int[] a,int n){
        int len =  a.length;
        int[] result = new int[len];

        for(int i= 0; i< len; i++){
            result[i] = a[(i+n)%len];
        }

        return result;
    }
}
