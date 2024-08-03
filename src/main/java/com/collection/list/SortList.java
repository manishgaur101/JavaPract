package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class SortList {
    public static void main(String[] args) {
        List<String> sList  = new ArrayList<>();
        Collections.addAll(sList,"abc","aab","aba","bba","ccv","hgy","kyy","tara","sitara","mitara","nitara");
        Vector<String> sVector = new Vector<>();
        Collections.addAll(sVector,"abc","aab","aba","bba","ccv","hgy","kyy","tara","sitara","mitara","nitara");

        System.out.printf("Given list:\n%s\n",sList);
        System.out.printf("Given Vector:\n%s\n",sVector);


        //Sorting in natural order (ascending order)
        Collections.sort(sList);
        Collections.sort(sVector);
        System.out.printf("\nNatural order sorted list:\n%s\n",sList);
        System.out.printf("\nNatural order sorted vector:\n%s\n",sVector);

        //Sorting in descending order
        Collections.sort(sList,(a,b)->b.compareTo(a));
        Collections.sort(sVector,(a,b)->b.compareTo(a));
        System.out.printf("\nDescending order sorted list:\n%s\n",sList);
        System.out.printf("\nDescending order sorted vector:\n%s\n",sVector);
    }
}
