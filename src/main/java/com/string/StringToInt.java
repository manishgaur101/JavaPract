package com.string;

public class StringToInt {
    public static void main(String[] args) {
        String money = "23455";

        // String to int
        int value = Integer.parseInt(money);
        System.out.println(value);

        // String to Integer
        Integer moneyI = Integer.valueOf(money);
        System.out.println(moneyI);

        //int to String using Integer.toString()
        String a = Integer.toString(value);
        System.out.println(a);

        // int to String using concatination
        String b = ""+value;
        System.out.println(b);

        //int to String using String.valueOf() which calls Integer.toString() internally
        String c = String.valueOf(value);
        System.out.println(c);

        //int to String using String.format
        String d = String.format("%d",value);
        System.out.println(d);

    }
}
