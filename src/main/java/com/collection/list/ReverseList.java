package com.collection.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> iList = new LinkedList<>();
        Collections.addAll(iList,1,2,3,4,5,6,7,8,9);
        System.out.println("Given List:\n"+iList);

        //Reversing list using Collections class
        /*Collections.reverse(iList);
        System.out.println("Reversed List:\n"+iList);*/

        //Reversing list using java8 lambda
        /*iList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);*/


    }
}
