package com.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TraverseMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap1 =  new HashMap<>();
        hashMap1.put("One", 1);
        hashMap1.put("Two", 2);
        hashMap1.put("Three", 3);
        // Contrary to HashTable HashMap allows one null key and n number of null values
        hashMap1.put(null,null);
        //Map does not allow duplicate keys if you add then old value will be updated
        hashMap1.put("Two",22);

        //Using Iterator
        Iterator<Map.Entry<String,Integer>> hashMap1iterator = hashMap1.entrySet().iterator();
        while (hashMap1iterator.hasNext()){
            System.out.println(hashMap1iterator.next());
           //Map.Entry<String,Integer> entry = hashMap1iterator.next();
            //System.out.println("Key:"+entry.getKey()+", Value: "+entry.getValue());
        }

        //Using Advanced For loop
        System.out.println("-----Printing using Advanced For loop:------");
        for (Map.Entry<String,Integer> entryFor : hashMap1.entrySet())
        {
            System.out.println("Key: " + entryFor.getKey() + ", Value: " + entryFor.getValue());
        }

        //Using forEach() method from Java8
        System.out.println("----------Printing using forEach method:--------");
        hashMap1.forEach((k,v)-> System.out.println("Key: "+ k + ", Value: "+v));

        //Iterating over keys
        System.out.println("----------Iterating over Keys:--------");
        for (String key : hashMap1.keySet()){
            System.out.println("Key: "+key);
        }

        //Iterating over values
        System.out.println("----------Iterating over Values:--------");
        for (Integer value: hashMap1.values())
        {
            System.out.println("Value: "+value);
        }
    }
}
