package com.Array;

import java.util.*;

public class CompareArray {
    public static void main(String[] args){

        Integer[] b1 =  {1,2,3,4,5};
        Integer[] b2 =  {1,2,3,5,4};
        int[] a1 =  {1,2,3,4,5};
        int[] a2 =  {1,2,3,5,4};
        System.out.println(a1.length);
        //If elements are same but order is different then false will be returned so sort the array before checking.
        System.out.println("Checking if arrays are equal using inBuilt Fxn: "+ Arrays.equals(a1,a2));
        System.out.println("Checking if arrays are equal using own Fxn: "+ isArrayEqual(a1,a2));
        System.out.println("Checking if arrays have same elements: "+ isArrayElementsSame(a1,a2));
        System.out.println("Checking if arrays are equal using inBuilt Fxn: "+ Arrays.equals(b1,b2));
        //Arrays.sort(b1,Comparator.reverseOrder());
        Arrays.sort(b1,(x,y)-> x-y);
        System.out.println(Arrays.toString(b1));
        Arrays.sort(b1,(x,y)-> y-x);
        System.out.println(Arrays.toString(b1));
    }

    /**
     * Function without using inbuilt methods like Arrays.equals() to check if arrays are equal.
     * @return
     */
    public static boolean isArrayEqual(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        int i = 0;
        while(i < a.length){
        if(a[i] != b[i]){
            return false;
        }
            i++;
        }
        return true;
    }

    public static boolean isArrayElementsSame(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        while(i < a.length){
            if(a[i] != b[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
