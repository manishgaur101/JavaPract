package com.collection.map;

import java.util.*;

public class CheckKeyExist {
    public static void main(String[] str){
        Map<String, Integer> iMap =  Map.of("manish",23,"pooja",21,"shayna",20);

        System.out.println("Key exist then true else false:"+iMap.keySet().contains("Manish"));
    }
}
