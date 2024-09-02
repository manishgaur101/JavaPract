package com.Array;

import java.util.*;

public class CompareStringArray {
    public static void main(String[] args){
        String[] a =  {"Manish","Gaur"};
        String[] b =  {"Gaur","Manish"};
        System.out.println("Do arrays equal Order Wise: "+ isArrayEqualOrderWise(a,b));
        System.out.println("Do arrays equal Element Wise: "+ isArrayEqualElementWise(a,b));
    }

    public static boolean isArrayEqualOrderWise(String[] a, String[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i=0; i < a.length; i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean isArrayEqualElementWise(String[] a, String[] b){
        if(a.length != b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
