package com.Array;

import java.util.*;

/**
 * Problem - Find 2 such elements whose diff is equal to given diff.
 */
public class FindPairWithDifference {

    /**
     * Method to find all pair whose diff is equal to the given diff.
     * Here used - else if block to make sure that the same number would not be considered for calculation
     * if it has made a group with other number.
     * Removal of satisfied elements from Set make sure that they are not considered for re processing.
     *
     * If we want that elements can be picked for re processing we can us if in place of else if and
     * can remove the Removal of satisfied elements statements.
     *
     * @param a
     * @param diff
     */
    public static void findPairDiffHashSet(int[] a, int diff){
        Set<Integer> aSet =  new LinkedHashSet<>();
        for(int num : a){
            aSet.add(num);
            if(aSet.contains(num - diff)){
                System.out.println("["+num+","+(num-diff)+"]");
                aSet.remove(num); //Removal of satisfied elements
                aSet.remove(num-diff); //Removal of satisfied elements
            }
            else if(aSet.contains(num + diff)){
                System.out.println("["+num+","+(num+diff)+"]");
                aSet.remove(num);//Removal of satisfied elements
                aSet.remove(num+diff); //Removal of satisfied elements
            }


        }
    }
    public static List<List<Integer>> findPairDiffTwoPointer(int[] a, int diff){
        // Take two pointers
        int left = 0;
        int right = left+1;

        //Take a List to put the pair elements in
        List<List<Integer>> iList =  new ArrayList<>();


        //Sort the array in Ascending order
        Arrays.sort(a);

        //Run the two pointer loop
        while(left < a.length && right < a.length){
            if(a[right] - a[left] < diff) {
                right++;
            }
            else if(a[right] - a[left] > diff){
                left++;
            }
            else if(a[right] - a[left] == diff) {
                List<Integer> pairList = new ArrayList<>();
                pairList.add(a[left]);
                pairList.add(a[right]);

                iList.add(pairList);
                left++;
                right++;
            }
        }
        return iList;
    }

    public static void main(String[] args){
        int[] a = {1,2,4,3,9,5,7,8,11,6};
        int diff =  3;

        //List<List<Integer>> iList = findPairDiffBruteForce(a,diff);
        //List<List<Integer>> iList = findPairDiffTwoPointer(a,diff);

        findPairDiffHashSet(a,diff);

        //print the pair which satisfy the difference condition.
        /*for(List<Integer> pair : iList){
            System.out.println(pair);
        }*/
    }

    /**
     * Method to find the pair whose difference is as per the given diff.
     * Using brute force technique.
     */
    public static List<List<Integer>> findPairDiffBruteForce(int[] a, int diff){
        List<List<Integer>> iList =  new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] - a [i] == diff || a[i] - a [j] == diff){
                    List<Integer> diffList =  new ArrayList<>();
                    diffList.add(a[i]);
                    diffList.add(a[j]);
                    // System.out.println("inner: "+diffList);
                    iList.add(diffList);
                }
            }
        }
        return iList;
    }
}
