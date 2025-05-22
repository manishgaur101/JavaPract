package com.collection.list;

import java.util.Arrays;
import java.util.List;

public class StringArrayToList {
    public static void main(String[] args){
        String s =  "Manish";
        List list = convertToList(s);
        System.out.println(list);
    }

    private static List convertToList(String o){
        //return Arrays.asList(o); [Manish] // String to List
        return Arrays.asList(o.split("")); //[M,a,n,i,s,h]
    }

}


