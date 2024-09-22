package com.string;

import java.util.*;

public class DescendingOrderBasedOnLenght {
    public static void main(String[] args){
        String s = "My Name is Manish Gaur";
        //Expected = "Manish Name Gaur My is";

        System.out.println("Given String: "+s);

        String[] arr =  s.split(" ");
        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed());

        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            sb.append(a).append(" ");
        }

        //print
        System.out.println("Output: "+sb);
    }
}
