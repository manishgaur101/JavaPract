package com.special;

import java.util.*;

public class ArrayToCollection {
    public static void main(String[] arg){
        String[] names = {"manish","sapna","apna","kalapna"};
        //converting array into modifiable list
        List<String> iList = new ArrayList<>(Arrays.asList(names));
        System.out.print(iList);
    }
}
