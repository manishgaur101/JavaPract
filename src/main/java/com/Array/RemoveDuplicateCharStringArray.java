package com.Array;

import java.util.stream.Collectors;

public class RemoveDuplicateCharStringArray {
    public static void main(String[] args) {
        String s = "Manishaa";
        System.out.println("Given String: "+ s);
        String a =  s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println("After duplicate removal: "+a);
    }
}
