package com.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringBasedOnLength {
    public static void main(String[] args){
        String s = "My Name is Manish Gaur";
        String [] arr = s.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println("Sorted string elements based on length: \n"+Arrays.toString(arr));
        System.out.println(sortWordsInAscendingLength(s));
        System.out.println(sortWordsInDescendingLength(s));
    }

    private static String sortWordsInDescendingLength(String s){
        String [] s1 = s.split(" ");
        Arrays.sort(s1,(a,b) -> Integer.compare(b.length(),a.length()));
        return String.join(" ",s1);
    }

    private static String sortWordsInAscendingLength(String s){
        String [] s1 = s.split(" ");
        //Arrays.sort(s1,Comparator.comparingInt(String::length));

        //or
        Arrays.sort(s1,(a,b) -> Integer.compare(a.length(), b.length()));
        return String.join(" ",s1);
    }
}
