package com.string;

public class RemoveChar {
    public static void main(String[] args) {
        String name = "ManishGaur";
        char toRemove = 'a';

        //Using toCharArray
        /*char a[] = name.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : a) {
            if(c!=toRemove){
                builder.append(c);
            }
        }
        System.out.println(builder.toString());*/

        //Using replace
        String nw = name.replace(Character.toString(toRemove),"");
        System.out.println(nw);
    }
}
