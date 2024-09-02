package com.sortingalgo;

import java.util.*;

public class quicksort {
    public static void main(String[] args){
        int[] arr =  {10, 7, 8,5, 9, 1, 5};
        int n = arr.length;
        System.out.println("Original array: "+Arrays.toString(arr));
        quickSortMethod(arr, 0, n-1);
        System.out.println("\nSorted array: "+Arrays.toString(arr));
    }

    public static void quickSortMethod(int[] a, int lb, int ub){
        if(lb<ub) {
            int loc = partition(a, lb, ub);
            quickSortMethod(a,lb,loc-1);
            quickSortMethod(a,loc+1,ub);
        }
    }

    public static int partition(int[] a, int lb, int ub){

        int pivot = a[ub];
        int i = lb -1;
        for(int j = lb; j < ub; j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[ub];
        a[ub] = temp;
        return i+1;
    }
}
