package com.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListToArray {
    public static void main(String[] args) {
        List<String> sList = new Vector<>();
        Collections.addAll(sList,"abc","do","pine","my","life");

        //new String[0] tells toArray() the type of array to return.
        String str[] = sList.toArray(new String[0]);
        System.out.println(Arrays.toString(str));
    }
}
