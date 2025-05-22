package com.string;

public class SplitvsToCharArray {

    public static void main(String[] arg){
        String s = "Manish";
        String result  = s.toCharArray() instanceof char[] ?
                "char array" : "String array";
        System.out.println(result);
        String out  = s.split("") instanceof String[] ?
                "String array" : "char array";
        System.out.println(out);

    }
}
