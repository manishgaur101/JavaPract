package com.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    public static void main(String[] args) {
        int [] nums = {2,3,4,1,5,6,6,9};
        System.out.println("Does nums array contains any duplicate = "+ containDuplicateBruteforce(nums) );
        System.out.println("Does nums array contains any duplicate = "+ containDuplicateSet(nums));
    }
    public static boolean containDuplicateBruteforce(int[] input){
        try{
            //brute force - Constlier approach
            for(int i = 0; i < input.length-1; i++){
                for(int j = i+1; j < input.length; j++){
                    if(input[i] == input[j]){
                        return true;
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }

    public static boolean containDuplicateSet(int[] input){
        try{
            // Using Set - a good approach
            Set<Integer> s1 = new HashSet<>();
            for(int a : input)
            {
                if(!s1.add(a)){
                    return true;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }

}

