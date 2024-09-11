package com.special;

public class ReverseWord {
    public static void main(String[] args){
        String s = "I like to see movies";
        System.out.println("Given String: \n"+s);
        String[] words = s.split(" ");
        System.out.println("Reverse words String: \n");
        for(int i=0; i< words.length; i++){
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        //print
        for(String sh : words){
            System.out.print(sh+ " ");
        }

        /**
         * Another way
         *
         * for(String s : a){
         *             System.out.print(new StringBuilder(s).reverse().append(" "));
         *         }
         */


    }
}
