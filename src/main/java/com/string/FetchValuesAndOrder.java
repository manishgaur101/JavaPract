package com.string;

import java.util.Arrays;
import java.util.*;
import java.util.PriorityQueue;

public class FetchValuesAndOrder {
    public static void main(String[] args){
        String s = "6/4/22 16:50";
        StringBuilder sb = new StringBuilder(s);
        String s1 = s.replaceAll("/"," ");
        String s2 = s1.replaceAll(":"," ");
        System.out.println(s2);
        String [] s3 =  s2.split(" ");
        List<Integer> iList = new ArrayList<>();
        for(int i = 0; i< s3.length ; i++){
            iList.add(Integer.parseInt(s3[i]));
        }
        System.out.println(iList);
        Collections.sort(iList);
        System.out.println(iList);


    }
}
