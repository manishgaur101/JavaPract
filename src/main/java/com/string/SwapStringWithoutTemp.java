package com.string;

public class SwapStringWithoutTemp {
    public static void main(String[] args) {
        String s1 = "Manish";
        String s2 = "Gaur";
        System.out.printf("Given:\ns1: %s\ns2: %s",s1,s2);

        s1 =  s1+s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.printf("\nModified:\ns1: %s\ns2: %s",s1,s2);
    }
}
