package com.collection.list.stack;

import java.util.*;

public class PrintListReverseOrder {
    public static void main(String[] org){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,45,6));
        System.out.println("Given List: "+list);
        System.out.println("----Printing List in reverse order or Insertion:----");
        Stack<Integer> stack =  new Stack<>();
        stack.addAll(list);

        //for loop will not print in reverse order
        /*for(Integer value : stack){
            System.out.println(value);
        }*/
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
