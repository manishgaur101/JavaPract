package com.string;

public class ReverseString {
    public static void main(String[] args) {
        String name = "MANISH";
        System.out.printf("Given:\n%s\n", name);

        //Using charAt
        String reverse = "";
        for (int i = 0; i < name.length() ; i++) {
            reverse = name.charAt(i)+reverse;
        }

        System.out.printf("Reversed:\n%s\n", reverse);

    }

    private static StringBuilder reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb;
    }
}
