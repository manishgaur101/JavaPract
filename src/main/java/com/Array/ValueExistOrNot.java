package com.Array;

import java.util.stream.IntStream;

public class ValueExistOrNot {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int valueToFind = 8;
        System.out.println("Value "+valueToFind+" exist in array or not: " +isValueExistJava7(a,valueToFind));
    }

    public static boolean isValueExistJava8(int[] a, int valueToFind){
        return IntStream.of(a)
                .anyMatch(x -> x == valueToFind);
    }

    public static boolean isValueExistJava7(int[] a, int valueToFind){
        boolean exist = false;
        for(int item : a){
            if(item == valueToFind){
                exist = true;
                break;
            }
        }
        return exist;
    }
}
