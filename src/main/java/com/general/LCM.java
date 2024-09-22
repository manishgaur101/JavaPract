package com.general;

public class LCM {
    public static void main(String[] args) {
        int a = 36;
        int b =  24;
        System.out.printf("\nLCM of %s & %s is: %s",a,b,findLCM(a,b));

    }

    public static int findLCM(int a,int b){
        int result = 0;
        int hcf =  HCF.findHCF(a,b);
        result =  a*b/hcf;
        return result;
    }
}
