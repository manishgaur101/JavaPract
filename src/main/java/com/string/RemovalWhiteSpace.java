package com.string;

public class RemovalWhiteSpace {
    public static void main(String[] args) {
    String s = "  A u to   ma t ion  ";
    System.out.println("Given: "+s);
    System.out.println("After removal whitespace:\n"+s.replaceAll("\\s",""));
    }


}
