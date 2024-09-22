package com.Array;

import java.util.*;

/**
 * Two Sum Problem where we need to find numbers which all elements form the target sum.
 *
 * solutions - with map, Two Pointer, brute force.
 */
public class TwoSumProblem {

    /**
     * Method to find solution with Two Pointer technique.
     */
    public static void twoSumTwoPointer(int[] a, int sum){
        Arrays.sort(a);
        int left = 0; int right = a.length-1;
        while(left < right){
            if(a[left]+a[right] > sum){
                right--;
            }
            else if(a[left] + a[right] < sum){
             left++;
            }
            else if(a[left] + a[right] == sum){
                System.out.println(a[left]+" & "+a[right]+" = "+ sum);
                left++;
                right--;
            }
        }
    }

    /**
     * Method to find the solution using Brute force technique.
     * @param a
     * @param sum
     */
    public static void twoSumBruteForce(int[] a, int sum){
        for(int i=0; i< a.length; i++){
            for(int j=i+1; j < a.length; j++){
                if(a[i]+a[j] == sum){
                    System.out.println(a[i]+" & "+a[j]+" = "+ sum);
                }
            }
        }
    }

    /**
     * This method solve this problem using Map which is the best solution for this.
     *  takes O(n) time complexity.
     * @param a given array
     * @param sum target sum
     */
    public static void twoSum(int[]a, int sum){
        Map<Integer,Integer> iMap =  new LinkedHashMap<>();
        for(int i = 0; i < a.length; i++){
            int otherPart =  sum - a[i];
            if(iMap.containsKey(otherPart)){
                System.out.println(a[i]+" & "+otherPart+" = "+ sum);
            }
            else{
                iMap.put(a[i],i);
            }
        }
    }

    public static void twoSumWdSet(int[] a, int sum){
        Set<List<Integer>> aSet =  new LinkedHashSet<>();
        for(int num : a){
            List<Integer> iList =  new ArrayList<>();
            if(aSet.contains(sum-num)){
                iList.add(sum-num);
                iList.add(num);
                //System.out.println("["+num+","+(sum-num)+"]");
                aSet.add(iList);
            }
        }
        //print
        for(List<Integer> pair : aSet){
            System.out.println(pair);
        }
    }
    public static void main(String[] args) {
        int [] a = {2,4,5,6,1,1};
        int sum =  6;
        twoSumWdSet(a,sum);
    }
}
