package com.special;

import java.util.*;

public class TraverseMapWithForLoop {
    public static void main(String[] args){
        Map<String,Integer> iMap = new HashMap<>(Map.of("rice",100,"wheat",250,"oil",90));
        for(Map.Entry<String,Integer> items : iMap.entrySet()){
            System.out.println("Item: "+items.getKey()+", Value: "+items.getValue());
        }
    }

}
