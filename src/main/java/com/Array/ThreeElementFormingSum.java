package com.Array;

import java.util.HashMap;

import java.util.*;

/**
 * This problem says that find such 3 elements from Array which equals to the given sum.
 */
public class ThreeElementFormingSum {

    public static void threeElementsSumMap(int[] a, int sum){
        // with brute force this solution is more easy so I am skipping this.
    }
    public static Set<List<Integer>> threeElementSumBruteForce(int[] a, int sum){
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i< a.length; i++){
            for(int j = i+1; j < a.length; j++){
                for(int k = j+1; k < a.length; k++){

                    // Check if the sum of the triplet is equal to the target
                    if(a[i]+a[j]+a[k] == sum){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(a[i]);
                        triplet.add(a[j]);
                        triplet.add(a[k]);

                        // Sort the triplet to avoid duplicates like [1, 2, 6] and [6, 2, 1]
                        Collections.sort(triplet);

                        // Add the triplet to the result list
                        result.add(triplet);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,6,9,5,5,6,2,3,1};
        int sum = 9;
        Set<List<Integer>> triplets = threeElementSumBruteForce(a,sum);
        if (triplets.size() > 0) {
            System.out.println("Triplets that sum to " + sum + ":");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        } else {
            System.out.println("No triplets found.");
        }
    }
}
