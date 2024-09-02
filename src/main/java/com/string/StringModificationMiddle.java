package com.string;

public class StringModificationMiddle {
    public static void main(String[] args){
        String given = "JavaConcepts";
        int givenLength = given.length();
        int indexValue = 4;
        String addition  = "Advanced";



        String sub1 =  given.substring(0,4);
        String sub2 = given.substring(4,givenLength-1);
        System.out.println(sub1);
        System.out.println(sub2);
        StringBuilder sb = new StringBuilder(sub1);
        sb.append(addition).append(sub2);
        System.out.println(sb);


        //Another simpler way
        String str = "JavaConcepts";
        String updatedStr =  str.replace("Java","JavaAdvanced");
        System.out.println(updatedStr);


    }
}
