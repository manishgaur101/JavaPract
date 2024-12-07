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
        /**
         * In java a char cannot have empty literal but String can have
         * and replace method usesages both parameters either String or char
         * this is why we have converted the char which we need to remove to String
         * so that both parameters can be of String type
         */

        String nw = name.replace(Character.toString(toRemove),"");
        System.out.println(nw);
    }
}
