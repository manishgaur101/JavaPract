package com.special;

import java.util.*;
import java.util.stream.*;

public class compressString {

    public static void main(String[] args){
        String input = "bbdddfwwwaamnofwoo";
        //Expected  - 2b3d2f4w2a1m1n3o

        System.out.println("Given String: "+input);
        StringBuilder output =  new StringBuilder();

        input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
                .forEach((k,v)->output.append(v).append(k));
        System.out.println("Output String: "+output);
    }
}
