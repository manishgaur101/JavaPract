package com.string;

public class FetchOnlyNumericValues {
    public static void main(String[] args){
        String given  = "hello/dear/12/04/24 16:50ma10ster";
        //Expected = 1204241650;
        //Below will replace all special Characters
        String updatedStr = given.replaceAll("\\W","");
        System.out.print(updatedStr+"\n");

        //Below will replace all non-numeric Characters
        System.out.println(given.replaceAll("[^0-9]",""));

        //Below will just keep only alphabetic characters
        System.out.println(given.replaceAll("[^a-zA-Z]",""));

    }
}
