package com.Array;

import java.util.*;
/**
 * Asked in Publicis sapient on 30 aug 2024
 */
public class KeepSpecialValuesOnly {
    public static void main(String[] args){
        int n[] = {123,900,23,12,456,1332,911};
        List<Integer> iList = new ArrayList<>();
        List<Integer> jList = new ArrayList<>();

        // Below is a code for start value is 1
        //Expected [123,12,911]
        for(int i= 0; i < n.length; i++){
            String value = String.valueOf(n[i]);
            if(value.charAt(0) == '1'){
                iList.add(Integer.parseInt(value));
            }
        }

        System.out.println(iList);

        // Below is a code for end value is 1
        //Expected [911]
        for(int i=0; i<n.length; i++){
            String value = new StringBuilder(String.valueOf(n[i])).reverse().toString();
            if(value.charAt(0)== '1'){
                jList.add(Integer.parseInt(new StringBuilder(value).reverse().toString()));
            }

        }
        System.out.println(jList);
    }
}
