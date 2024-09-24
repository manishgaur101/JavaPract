package com.dsa.techniques.slidingwindow;

public class MaxSumSubArrayVarSizeWindow {
    public static void main(String[] args) {
        //Given
        int[] arr = {100,200,300,400,250};

        // Calculating
        int sum =  findMaxSumSubArray(arr);

        //print
        System.out.println(sum);
    }

    public static int findMaxSumSubArray(int[] a){
        int sum;
        int maxSum = 0;
        for(int i=0; i < a.length;i++){
            sum = 0;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
