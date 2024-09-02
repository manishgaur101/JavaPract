package com.general;

import java.util.stream.*;

public class Table {
    public static void main(String[] args){
        int number = 3;
        IntStream.rangeClosed(1,10)
                .map(input-> input*number)
                .forEach(System.out::println);
    }
}
