package com.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseElements {
    public static void main(String[] args) {

        int runs[] = {22,31,45,10,9};
        System.out.printf("Given array is: ");

        // Using java7
        /*for (int run : runs) {
            System.out.printf("%d,",run);
        }
        System.out.printf("\nArray After reverse:");

        int temp;
        for (int i = 0; i < runs.length/2; i++) {
            temp = runs[i];
            runs[i] = runs[runs.length-1-i];
            runs[runs.length-1-i] = temp;
        }

        for (int run : runs) {
            System.out.printf("%d,",run);
        }*/

        // Using java8
        System.out.println(Arrays.toString(runs));
        Arrays.stream(runs).forEach(System.out::println);

        System.out.printf("Array After reverse:\n");
        IntStream.range(0,runs.length)
                .map(i -> runs[runs.length-1-i])
                .forEach(System.out::println);

    }
}
