package com.string;

/**
 * This program sort the String based on word length without using existing fnx like Arrays.sort()
 * Using quick sort here for sorting purpose.
 */
public class AscendingSortLengthBasedQuickSort {

    public static int partition(String[] a, int low, int high){
        String pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++){
            if(a[j].length() <= pivot.length()){
                i++;
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        String temp = a[i];
        a[i] =  a[high];
        a[high] = temp;
        return i;

    }
    public static void quickSortAsc(String[] a, int low, int high){
        if(low < high){
            int pivotIndex = partition(a,low,high);
            quickSortAsc(a,0,pivotIndex-1);
            quickSortAsc(a,pivotIndex+1,high);
        }
    }

    public static void main(String[] args){
        String s = "My Name is Manish Gaur";
        //Expected =  "My is Name Gaur Manish";

        String[] arr =  s.split(" ");
        int n =  arr.length;
        System.out.println("Given String: "+s);
        quickSortAsc(arr, 0, n-1);

        //Construct String from String[] and print the String
        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            sb.append(a).append(" ");
        }
        System.out.println("Output String: " +sb);
    }
}
