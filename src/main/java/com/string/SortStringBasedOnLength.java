package com.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringBasedOnLength {
    public static void main(String[] args){
        String s = "My Name is Manish Gaur";
        String [] arr = s.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println("Sorted string elements based on length: \n"+Arrays.toString(arr));
    }
}
