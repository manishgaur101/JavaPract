package com.string;

public class ProveStringImmutable {
    public static void main(String[] args) {

        // When creating objects with String literals
        String s1 =  "MANISH";
        String s2 = "MANISH";
        System.out.println(s1==s2); //should be true
        s1 =  s1 + " Gaur";
        System.out.println(s1 == s2); // should be false if String is immutable

        // When creating objects with new keyword
        String n1 = new String("Sonia");
        System.out.println(n1);
        n1.concat(" Sharma"); // A new String object is getting created but we are not saving it's ref. here
        System.out.println(n1); // If the value is "Sonia" that proves String is immutable
    }
}
