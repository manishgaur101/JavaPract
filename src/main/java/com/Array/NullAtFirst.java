package com.Array;

import java.util.Arrays;
import java.util.Comparator;

public class NullAtFirst {
    public static void main(String[] args) {
        String[] a = {"manish", "gaur", null, "10", null, "30"};
        System.out.println(Arrays.toString(a));

        //Putting null values first.
        Arrays.sort(a, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println(Arrays.toString(a));

        // keeping null values at end
        Arrays.sort(a, Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(a));
    }
}
