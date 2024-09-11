package com.Array;

import java.util.Arrays;

public class MergeCharArray {
    public static void main(String[] args) {
        char[] a = {'a','b','z'};
        char[] b = {'z','a','b'};

        StringBuilder sb =  new StringBuilder();
        sb.append(a);
        sb.append(b);

        //convert StringBuilder to char[]
        char[] merged =  sb.toString().toCharArray();

        //print
        System.out.println(Arrays.toString(merged));
    }
}
