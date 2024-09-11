package com.Array;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesStringArray {
    public static void main(String[] args) {
        String [] s = {"manish","gaur","gautam","gaur"};
        System.out.println("Given array: "+Arrays.toString(s));

        Set<String> sSet =  new LinkedHashSet<>(Arrays.asList(s));

        System.out.println(sSet);
    }
}
