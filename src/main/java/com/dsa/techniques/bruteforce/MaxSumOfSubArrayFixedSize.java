package com.dsa.techniques.bruteforce;

/**
 * This program solve this problem with brute force which will use two for loop.
 * https://www.youtube.com/watch?v=rGl2Z6fuAas&list=PLQ7ZAf76c0ZPAnTKbEMAvGYaQWBvpLCf7&index=2
 * We can also solve it using Sliding window which is more optimized solution.
 */

public class MaxSumOfSubArrayFixedSize {
    public static void main(String[] args){
        //Given
        int[] arr = {100,200,300,400,250};
        int k = 2;

        //Finding the maximum sum
        int sum =  findMaxSumBruteForce(arr,k);

        //print the max Sum
        System.out.println(sum);
    }

    public static int findMaxSumBruteForce(int[] a, int k){
        int sum;
        int maxSum = 0;
        int n =  a.length;
        for(int i = 0; i <= n-k; i++){
            sum = 0;
            for(int j=i; j <= i+k-1; j++ ){
                sum += a[j];
            }
            maxSum =  Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
