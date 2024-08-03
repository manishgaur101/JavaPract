package com.collection.list;

import java.util.*;
import java.util.stream.Collectors;

public class AddTraverseRemoveArrayList {
    public static void main(String[] args) {
        // Declaring List
        List<Integer> iList = new ArrayList<>();
        List<String> sList = new ArrayList<>();
        List anyList = new ArrayList();

        //Add elements in List
        iList.add(1);
        //iList.add("String"); // Can Only enter Integer in this List.

        anyList.add(2);
        anyList.add("anylist");
        anyList.add(2,"Sonam");
        anyList.add(3,45.00);
        anyList.add(2);
        anyList.add(3);
        anyList.add(2);
        anyList.add("tara");
        anyList.add("sitara");
        anyList.add("tara");


        //sList.add(1); // can only enter String in this list.
        sList.add("slist");

        //Traverse List
        printListItems(iList);
        printListItems(sList);
        printListItems(anyList);

        //----------------Modifying list items----------------
        System.out.println("----------Modified List---------");
        anyList.set(2,"alice");

        //----------------Remove first instance only----------
        anyList.remove((Integer)2); //Casting needed to remove the Object

        //----------------Remove all instances----------------
        //anyList.removeAll(Collections.singleton(2));
        anyList.removeIf(e-> e.equals(2));       // using java8 lambda
        //anyList.removeIf(e->e.equals("tara"));    //java8 lambda
        anyList.removeIf("tara"::equals);         // java8 method reference
        //anyList.removeIf(((Integer)2)::equals);   //java8 method reference
        printListItems(anyList);
    }
    public static void printListItems(Collection l){
            Iterator li = l.iterator();
            while (li.hasNext()) {
                System.out.println(li.next());
            }
    }
}
