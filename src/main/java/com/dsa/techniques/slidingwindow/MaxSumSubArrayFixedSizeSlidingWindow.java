package com.dsa.techniques.slidingwindow;

/**
 * This solution is using Sliding window technique whose time complexity is better than brute force
 * which uses the inner loop while here two seperate loops are used.
 */
public class MaxSumSubArrayFixedSizeSlidingWindow {
    public static void main(String[] args) {
        //Given
        int [] arr = {100,200,300,400,250};
        int k =  2;

        // Calculating
        int sum =  findMaxSumSubArraySW(arr, k);

        //print
        System.out.println(sum);
    }

    public static int findMaxSumSubArraySW(int[] a, int k){
        int maxSum = 0;
        int sum = 0;
        int n =  a.length;
        int index = 0;

        //1 . Initializing the array for fixed size sliding window
        while(index < n && index < k){
            //find Sum of first k elements
            sum += a[index];
            index++;
        }
        maxSum = sum;

        //2. Calculate the other subArray elements
        for(int i = 1; i < n-k+1; i++){
            int prvElement =  a[i-1];
            int newElement =  a[i+k-1];
            sum =  sum - prvElement + newElement;

            //3. Calculate the answer
            maxSum =  Math.max(maxSum,sum);
        }

        return maxSum;
    }
}
