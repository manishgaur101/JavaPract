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
        int [] result_merged = arrayCopy(a,b);
        System.out.println(Arrays.toString(result_merged));
    }

    /**
     * Sudo -
     * Given two arrays
     * Create a new array of length of two arrays
     * uni directional loop on first array
     * copy elements from first array to result array
     * uni directional loop on second array
     * copy elements from second array to result array
     * print result array
     * @param
     *        a - int[] representing first array
     *        b - int[] representing second array
     */
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

    /**
     * This method is faster than native iteration coz it use
     * system-level operations.
     * @param a
     * @param b
     * @return
     */
    public static int[] arrayCopy(int[] a, int[] b){
        int[] mergedArr = new int[a.length + b.length];
        System.out.println("Length of first array:"+a.length);
        System.out.println("Length of second array:"+b.length);
        //Last argument is exclusive
        System.arraycopy(a,0,mergedArr,0,a.length);
        System.arraycopy(b,0,mergedArr,a.length,b.length);
        System.out.println(Arrays.toString(mergedArr));
        return mergedArr;
    }
}
