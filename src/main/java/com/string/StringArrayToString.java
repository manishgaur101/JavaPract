package com.string;

public class StringArrayToString {
    public static void main(String[] args){
        String[] a = {"My","name","is","Manish"};

        StringBuilder sb = new StringBuilder();

        for(String as : a){
            sb.append(as).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
