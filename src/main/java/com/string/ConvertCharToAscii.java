package com.string;

public class ConvertCharToAscii {
    public static void main(String[] args){
        String given = "Manish";
        String asciConverted = convertAscii(given);
        System.out.println("Given: " +given);
        System.out.println("Ascii: "+asciConverted);
    }

    public static String convertAscii(String s){
        StringBuilder sb =  new StringBuilder();
        for(Character c : s.toCharArray()){
            sb.append((int)c);
        }
        return sb.toString();
    }
}
