package com.string;

import java.util.Arrays;

public class ConvertingCharArraytoString {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        //using Arrays.toString();
        String str = Arrays.toString(charArray);
        System.out.println(str);

        //Using String.valueOf();
        String s = String.valueOf(charArray);
        System.out.println(s);

        //Using String constructor
        String a =  new String(charArray);
        System.out.println(a);
    }
}
