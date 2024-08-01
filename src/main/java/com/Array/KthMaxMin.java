package com.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxMin {
    public static void main(String[] args) {
        int runs[] = {22,2,13,18,21,34,45,99,8,8,2,13,99,6,47};
        System.out.printf("Given Array is: \n%s\n",Arrays.toString(runs));
        int kLargest = 10;
        PriorityQueue<Integer> runQueue = new PriorityQueue<>(kLargest);
        //System.out.println(runQueue.size());// No Elements inserted so size 0
        for (int run : runs) {
            if(!runQueue.contains(run))
                runQueue.offer(run);
            if(runQueue.size() > kLargest){
                System.out.printf("Removing element from Head:%d\n",runQueue.poll());
            }
        }
        if (!(kLargest > runQueue.size()))
            System.out.printf("\n%s Largest number is: %d ", kLargest, runQueue.peek());
        else System.out.printf("Size of queue is less than %s",kLargest);

        //Find the smallest Number in array
        //kthMin(runs,2);
        kthMinWithJava8(runs,2);
    }

    /**
     * Saving values in Priority query in descending order via Collections class
     * @param givenArray
     * @param k
     */
    public static void kthMin(int[] givenArray, int k){
        PriorityQueue<Integer> pQueue =  new PriorityQueue<>(Collections.reverseOrder());
        for (int i : givenArray) {
            if(!pQueue.contains(i))
                pQueue.offer(i);
            if(pQueue.size()>k)
                System.out.printf("\nRemoving element from Head:%d",pQueue.poll());
        }
        System.out.printf("\n%s smallest number is: %d ", k, pQueue.peek());

    }
    /**
     * Saving values in Priority query in descending order with java8 Lambda
     * @param givenArray
     * @param k
     */
    public static void kthMinWithJava8(int[] givenArray, int k){
        PriorityQueue<Integer> pQueue =  new PriorityQueue<>((a,b) -> b-a);
        for (int i : givenArray) {
            if(!pQueue.contains(i))
                pQueue.offer(i);
            if(pQueue.size()>k)
                System.out.printf("\nRemoving element from Head:%d",pQueue.poll());
        }
        System.out.printf("\n%s smallest number is: %d ", k, pQueue.peek());

    }
}
