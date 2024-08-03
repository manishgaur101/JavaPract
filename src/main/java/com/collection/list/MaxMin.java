package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        Collections.addAll(iList,3,44,990,130,45,-1,-5,0,55,22,3);

        System.out.println("Given List:\n"+iList);

        //Finding Max and Min using java8 stream
        iList.stream()
                        .max((a,b)->a-b).ifPresent(e-> System.out.println("Max Value is:"+e));

        iList.stream()
                .min((a,b)->a-b).ifPresent(e-> System.out.println("Min Value is:"+e));


    }
}
