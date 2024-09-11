package com.string;

public class ReverseWordInString {
    public static void main(String[] args){
        String s = "My Name is Manish Gaur";
        //Expected =  "yM emaN si hsinaM ruaG";

        System.out.println("Given String: "+s);

        /** Reversing each word of String */
        //reverseWordBuilder(s);
        reverseWordForLoop(s);
    }


    /**
     * Fxn to reverse each word of String using StringBuilder.
     * @param s
     */
    public static void reverseWordBuilder(String s){
        String[] arr = s.split(" ");
        for(String a : arr){
            System.out.print(new StringBuilder(a).reverse().append(" "));
        }
    }

    /**
     * Fxn to reverse each word of String using For loop.
     * @param s
     */
    public static void reverseWordForLoop(String s){
        String[] arr = s.split(" ");
        for(int i = 0; i <=arr.length - 1; i++){
            char[] c = arr[i].toCharArray();
            for(int j = c.length-1; j >= 0; j--){
                System.out.print(c[j]);
            }
            System.out.print(" ");
        }
    }
}
