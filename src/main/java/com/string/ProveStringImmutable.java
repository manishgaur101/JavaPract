package com.string;

public class ProveStringImmutable {
    public static void main(String[] args) {
        String s1 =  "MANISH";
        String s2 = "MANISH";
        System.out.println(s1==s2); //should be true
        s1 =  s1 + " Gaur";
        System.out.println(s1 == s2); // should be false if String is immutable
    }
}
