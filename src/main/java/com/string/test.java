package com.string;

public class test {
    public static void main(String args[]) {
    String s = "A   U TO Ma     t   i on";
        System.out.println("Given: "+s);
        System.out.println("After removing space: ");
        System.out.println(s.replaceAll("\\s",""));

    }
}
