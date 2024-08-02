package com.Array;

import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String players[] = {"Daniyal","Paresh","Himank","Pariksha","Payal","Rubina"};
        System.out.printf("Given : \n%s\n", Arrays.toString(players));

        //Using java8
        System.out.printf("\n---------Using Java8--------\n");
        System.out.printf("Sorting in Ascending order\n");
        Arrays.stream(players)
                .sorted((a,b)-> a.compareTo(b))
                .forEach(System.out::println);

        System.out.printf("Sorting in Descending order\n");
        Arrays.stream(players)
                .sorted((a,b)-> b.compareTo(a))
                .forEach(System.out::println);

    }
}
