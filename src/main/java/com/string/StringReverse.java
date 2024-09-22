package com.string;

public class StringReverse {
    public static void main(String[] args){
        String s = "My Name is Manish Gaur";
        //Expected = "ruaG hsinaM si emaN yM";

        /**Different methods to implement this.*/
        //reverseStringwdBuilder(s);

        reverse(s);
    }

    /**
     * Fxn to reverse a String using StringBuilder.
     * @param s
     */
    public static void reverseStringwdBuilder(String s){
        System.out.println(new StringBuilder(s).reverse());
    }

    /**
     * Fxn to reverse a String using for loop.
     * @param s
     */
    public static void reverse(String s){
        char[] a =  s.toCharArray();
        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i]);
        }
    }
}
