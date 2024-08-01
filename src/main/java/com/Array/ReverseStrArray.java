package com.Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseStrArray {
    public static void main(String[] args) {
        String players[] = {"Sachin","Rohit","Sehawg","Ganguli","Gambhir","Kohli"};
        System.out.printf("Name of the players:\n%s\n", Arrays.toString(players));

        System.out.printf("After Array elements reversed:\n");
        //Using Java8
        IntStream.range(0,players.length)
                .mapToObj(i -> players[players.length-1-i])
                .forEach(System.out::println);

        //Using Java7
        String temp;
        int count = players.length;
        for (int i = 0; i < players.length/2; i++) {
            temp =  players[count-1-i];
            players[count-1-i] =  players[i];
            players[i] = temp;
        }
        System.out.println(Arrays.toString(players));

    }
}
