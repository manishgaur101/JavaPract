package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddIntoLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> linkedMap1 =  new LinkedHashMap<>();
        linkedMap1.put("Id",10);
        linkedMap1.put("birthday",11);
        linkedMap1.put("age",44);
        linkedMap1.put("education",12);
        linkedMap1.put("pincode",10046);
        linkedMap1.put("age",32);
        linkedMap1.put(null,null);
        linkedMap1.put(null,12); //old null key will be updated with this value.

        System.out.println(linkedMap1);

    }
}
