package com.sortingalgo;

import java.util.*;

public class QuickSortDesc {

    public static void quickSortDesc(int[] a, int low, int high){
        if(low < high){
            int pivotIndex = partition(a,low,high);
            quickSortDesc(a,0,pivotIndex-1);
            quickSortDesc(a,pivotIndex+1,high);
        }
    }

    public static int partition(int[] a,int low, int high){
        int pivot = a[high];
        int i = low -1;
        for(int j=low; j<high; j++){
            if(a[j] >= pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        i++;
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;
        return i;
    }

    public static void main(String[] args){

        int[] a = {10,3,4,2,1,19,21};
        int n = a.length;
        System.out.println("Given Array: "+Arrays.toString(a));
        quickSortDesc(a,0,n-1);
        //print
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+ " ");
        }
    }



}
