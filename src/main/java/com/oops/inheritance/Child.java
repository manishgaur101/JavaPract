package com.oops.inheritance;

public class Child extends Parent {
    public static void main(String[] args) {
        System.out.println("My name is: Manish "+lastName);
        System.out.println("My total property value is: "+myProperty());
    }

    public static int myProperty(){
        return 200 + property();
    }
}
