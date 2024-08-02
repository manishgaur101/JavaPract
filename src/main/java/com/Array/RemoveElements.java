package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        int runs[] = {1,9,8,0,1,3,4,1,8,7,7};
        System.out.printf("Given:\n%s\n", Arrays.toString(runs));

        int removeElement = 8;

        //Using Java8
       /* runs = Arrays.stream(runs)
                .filter(e -> e != removeElement)
                .toArray();

        System.out.printf("Modified:\n%s\n", Arrays.toString(runs));*/

        //Using List
        List<Integer> newlist = new ArrayList<>();
        for (int run : runs) {
            if(run != removeElement)
                newlist.add(run);
        }

        runs = newlist.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.printf("Modified:\n%s\n", Arrays.toString(runs));
    }
}
