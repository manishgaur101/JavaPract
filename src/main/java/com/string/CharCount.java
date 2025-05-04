package com.string;

import java.util.*;
import java.util.stream.*;

public class CharCount {
    public static void main(String[] args) {
        String str = "india";
        //Applying further operations on collect
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //Showing the Count of each character in a String
        System.out.println("Character count are: ");
        Map<Character, Long> iMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(iMap);

        //filter only non-duplicate characters
        System.out.println("Unique characters are: ");
        iMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .forEach(k -> System.out.print(k + " "));

        //Loop through Map via Entry
        System.out.println();
        Map<Character, Integer> charCountMap = countChar(str);
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //printing only duplicate characters
        System.out.println("Duplicate Characters: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() +" : " + entry.getValue());
            }


        }
    }

    /**
     * Method to return char count of each String using core java based.
     * @param s
     * @return map
     */
    private static Map<Character, Integer> countChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        //for(int i = 0; i < s.length(); i++){
            //char c = s.charAt(i);
            //map.put(c,map.getOrDefault(c,0)+1);
        //}

        // Use either above commented for loop code or below
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}

