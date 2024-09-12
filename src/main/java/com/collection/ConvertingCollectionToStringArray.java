package com.collection;

import java.util.*;

public class ConvertingCollectionToStringArray {
    public static void main(String[] args) {
        //=================converting Set into String[]============================
        String[] s = {"manish","gaur","india","bikaner","manish"};
        System.out.println(Arrays.toString(s));
        SortedSet<String> sorts =  new TreeSet<>();
        sorts.addAll(Arrays.asList(s));
        String [] b = sorts.toArray(new String[0]); //Defining the String[] default size 0
        System.out.println(Arrays.toString(b));

        //=================converting List into String[]============================
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(s));
        String[] c =  list.toArray(new String[0]);
        System.out.println(Arrays.toString(c));


    }
}
