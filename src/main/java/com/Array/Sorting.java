package com.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        int runs[] = {22,0,9,17,53,4,8,21};
        System.out.printf("Given array is:\n%s\n",Arrays.toString(runs));

        // Using Java8
        // Sorting in ascending order and then printing - No Inline array change
        System.out.printf("\n---------Using Java8------------\n");
        System.out.printf("Sorting in ascending order:");
        Arrays.stream(runs)
                .boxed()
                .sorted()
                        .forEach(System.out::println);

        //System.out.printf("Given array is:\n%s\n",Arrays.toString(runs));

        //Sorting in descending order and then printing - No Inline array change
        System.out.printf("\nSorting in Descending order:\n");
        Arrays.stream(runs)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        //Inline Sorting in ascending order
        System.out.printf("\nInline Sorting in ascending order:\n");
        Arrays.sort(runs);
        System.out.println(Arrays.toString(runs));

        //Inline Sorting in descending order
        System.out.printf("\nInline Sorting in descending order:\n");
        Integer Irun[] = Arrays.stream(runs)
                        .boxed()
                                .toArray(Integer[]::new);
        Arrays.sort(Irun,(a,b)-> Integer.compare(b,a));
        System.out.println(Arrays.toString(Irun));

    }
}
