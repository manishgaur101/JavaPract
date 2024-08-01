package com.Array;

public class FindMinMax {
    public static void main(String[] args) {
        int runs[] = {2,3,44,45,77,12,1,77,0};
        //double runs[] = {2.11,33.44, 55.1, 0.01,44.4};
        int max=0,min = runs[0];
        for (int i = 0; i < runs.length; i++) {
            if(runs[i]>max){
                max = runs[i];
            }
            else if(runs[i] < min){
                min = runs[i];
            }
        }
        //System.out.printf("Max value is: %.2f and Min value is: %.2f",max,min);
        System.out.printf("Max value is: %d \nMin value is: %d ",max,min);

    }
}
