package com.general;

public class HCF {
    public static void main(String[] args) {
        int a = 36;
        int b = 24;
        int hcf  = findHCF(a,b);
        System.out.printf("HCF of %s & %s is: %s",a,b,hcf);
    }

    /**
     * In Math's we use Euclidean algo to find HCF.
     * Here this methods use that algo which has 3 steps.
     * @param a
     * @param b
     * @return
     */
    public static int findHCF(int a, int b){
        int result = 0;
        int remainder =  1;
        while(!(remainder==0)){
            // Step1 - Divide
            remainder = a%b;
            a = b;
            b = remainder;
            if(remainder == 0){
                result =  a;
            }

        }
        return result;
    }
}
