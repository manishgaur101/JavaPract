package com.recurrsion;

public class TestRecurrsion {
    public static void main(String[] arg){
        rec(0);
    }
    public static void rec(int i){
        if(i<=1) {
            i++;
            show();
            rec(i);
            rec(i);
        }
    }

    public static void show(){
        for(int i=0; i <1;i++) {
            System.out.println("Show me");
        }
    }
}
