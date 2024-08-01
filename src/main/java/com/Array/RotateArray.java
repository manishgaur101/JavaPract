package com.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int runs[] = {1,2,3,4,5,6,7,8};
        System.out.printf("Given array is:%s", Arrays.toString(runs));
        rotateClockwise(runs.clone(),2);// Cloned as array in method call will be pass by ref.

        //Using Java7 - anticlockwise rotation of array elements
        int firstIndexValue;
        int rotationCount = 3;
        while(rotationCount>0)
        {
            firstIndexValue = runs[0];
            for (int i = 0; i < runs.length - 1; i++) {
                runs[i] = runs[i + 1];
            }
            rotationCount--;
            runs[runs.length-1] = firstIndexValue;
        }

        System.out.printf("\nAnticlockwise shifted array is:%s\n", Arrays.toString(runs));
    }

    /**
     * Clockwise shifting of array elements.
     * @param a - Array to be shifted
     * @param rotationCount - Rotation count
     */
    public static void rotateClockwise(int[] a, int rotationCount){
        int firstIndexValue;
        int givenArray[] = a;

        while(rotationCount>0)
        {
            firstIndexValue = givenArray[givenArray.length-1];
            for (int i = givenArray.length - 1; i > 0; i--) {
                givenArray[i] = givenArray[i - 1];
            }
            rotationCount--;
            givenArray[0] = firstIndexValue;
        }

        System.out.printf("\nClockwise shifter array is:%s\n", Arrays.toString(givenArray));

    }
}
