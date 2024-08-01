package com.Array;

import java.util.Arrays;

public class PrintIndex {
    public static void main(String[] args) {
        int runs[] =  {33,41,55,6,7,88,90,7};
        System.out.printf("Given array is:%s\n", Arrays.toString(runs));

        int x = 7;
        for (int i = 0; i < runs.length; i++) {
            if(runs[i]==x) {
                System.out.printf("\nFirst Index value of %d is: %d ", x, i);
                break;
            }
        }
    }

}
