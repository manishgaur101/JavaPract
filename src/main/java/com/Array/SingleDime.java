package com.Array;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SingleDime {

    public static void main(String[] args) {
        // Take user input and save values in single dimentional array

        int[] marks;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        marks = new int[input.nextInt()];
        System.out.printf("Length of array: %d\n",marks.length);

        System.out.println("Enter the elements:");

        // with java8
        /*marks = IntStream
                .range(0,marks.length)
                .map(i-> input.nextInt()).toArray();*/ //no need of conversion from String to int

        // Since it's primitive type So have to use this way Arrays.stream()
       /* Arrays.stream(marks).forEach(System.out::println);*/

        // with java7
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        System.out.println("The values you entered are:");
        for (int mark : marks) {
            System.out.println(mark);
        }







    }
}
