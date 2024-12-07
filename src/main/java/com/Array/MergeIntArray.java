package com.Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeIntArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,2,4,5};
        int [] b = {4,5,6,7};

        System.out.println("Given Array: "+Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();

        System.out.println("Merged Array: "+Arrays.toString(c));

        int[] d =  mergeIntArray(a,b);
        System.out.println("Merged array without Stream:\n"+Arrays.toString(d));

        System.out.println("---Array merge using System class---");
        int [] result_merged = mergeIntArray(a,b);
        System.out.println(Arrays.toString(result_merged));
    }

    public static int[] mergeIntArray(int[] a, int[] b){
        int [] c =  new int[a.length+b.length];
        int index = 0;
        for(int i : a){
            c[index++] = i;
        }
        for(int j : b){
            c[index++] = j;
        }
        return c;
    }

    public static int[] arrayCopy(int[] a, int[] b){
        int[] mergedArr = new int[a.length + b.length];
        System.arraycopy(b,0,mergedArr,0,b.length);
        System.out.println(Arrays.toString(mergedArr));
        return mergedArr;
    }
}
