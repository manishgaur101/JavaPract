package com.string;

public class RemoveNonStringChar {
    public static void main(String[] args) {
        String data =  "mani100data9@20$$";
        System.out.printf("Given:\n%s\n",data);

        //Using regular expression
        System.out.printf("Modified:\n%s\n",data.replaceAll("[^a-zA-Z]",""));

        // Regular expression meaning
        //"^[a-zA-Z]" means - "match all strings that start with a letter"
        //"[^a-zA-Z]" means - "match all strings that contain a non-letter"
    }
}
