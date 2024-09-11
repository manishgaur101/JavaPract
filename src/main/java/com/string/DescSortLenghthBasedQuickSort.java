package com.string;

/**
 * Sorting String based on length in descending order
 * We can use Arrays.sort(arr,Comparator.comparingInt(String::length).reversed())
 * But if We do not want to use existing method than we can refer Quick sort like shown here.
 */
public class DescSortLenghthBasedQuickSort {

    public static int partition(String[] a, int low, int high){
        String pivot =  a[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(a[j].length() >= pivot.length()){
                i++;
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        String temp =  a[i];
        a[i] = a[high];
        a[high] =  temp;
        return i;
    }
    public static void quickSortDesc(String[] a, int low, int high){
        if(low < high){
            int pivotIndex =  partition(a,low,high);
            quickSortDesc(a,0,pivotIndex-1);
            quickSortDesc(a,pivotIndex+1,high);
        }
    }

    public static void main(String [] args){
        String s = "My Name is Manish Gaur";
        System.out.println("Given String: "+s);
        //Expected = "Manish Name Gaur My is";
        String [] arr = s.split(" ");
        int n = arr.length;
        quickSortDesc(arr,0,n-1);

        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            sb.append(a).append(" ");
        }

        //print output string
        System.out.println("Output String: "+sb);
    }
}
