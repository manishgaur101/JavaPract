package com.collection.map;

import java.util.*;
import java.util.stream.*;

public class CheckValueExist {
    public static void main(String[] str){
        //Map.of() creates unmodifiable Map
        Map<String, Integer> iMap = Map.of("Manish",23,"Pooja",34,"Supriya",10,"Dimple",23);

        // values() method returns Collection view of all values of Map and contains method is from Collection(I)
        System.out.println(iMap.values().contains(22));
    }
}
