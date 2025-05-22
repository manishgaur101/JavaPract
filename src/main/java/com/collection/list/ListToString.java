package com.collection.list;

import java.util.Arrays;
import java.util.List;

public class ListToString {
    public static void main(String [] args){
        List<String> list = Arrays.asList("M","A","N","I","S","H");
        String s  = String.join("",list);
        System.out.println(s);
    }
}
