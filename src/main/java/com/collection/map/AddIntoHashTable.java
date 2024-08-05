package com.collection.map;

import java.util.Hashtable;
import java.util.Map;

public class AddIntoHashTable {
    public static void main(String[] args) {
        Map<String,Integer> tableMap1 =  new Hashtable<>();
        tableMap1.put("id",19);
        tableMap1.put("birthday",23);
        tableMap1.put("age",21);
        tableMap1.put("pincode",110046);
        tableMap1.put("age",34);
        //tableMap1.put(null,null);
        //tableMap1.put(null,78);
        tableMap1.put("id",null);
        System.out.println(tableMap1);
    }
}
