package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CopyList {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(15);
        iList.add(21);
        System.out.println("Given List: "+ iList);

        //Using Constructor
        List<Integer> iListConstructor = new ArrayList<>(iList);
        System.out.println("First Copied List: "+ iListConstructor);

        //Using Java8
        List<Integer> iListJava8 =  iList.stream().collect(Collectors.toList());
        System.out.println("Second Copied List: "+ iListJava8);

        //Using addAll
        List<Integer> iListAddAll = new ArrayList<>();
        iListAddAll.addAll(iList);
        System.out.println("Third Copied List: "+ iListAddAll);



    }
}
