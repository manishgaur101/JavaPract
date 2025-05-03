package com.string;

public class StringArrayToString {
    public static void main(String[] args){
        String[] a = {"My","name","is","Manish"};

        StringBuilder sb = new StringBuilder();

        for(String as : a){
            sb.append(as).append(" ");
        }
        System.out.println(sb.toString().trim());

        System.out.println(convertUsingLoop(a));

        System.out.println(convertStringArrayToString(a));
    }

    private static String convertUsingLoop(String[] a){
        String s = "";
        for(int i = 0; i < a.length; i++){
            s += a[i];
        }
        return s;
    }

    private static String convertStringArrayToString(String[] a){
        return String.join(" ",a); // String Array to String for v8+
    }
}
