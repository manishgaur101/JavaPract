package com.oops.polymorphism;

public class Parent {

    public void show(){
        System.out.println("Parent show method.");
    }

    //overloading
    public void show(String msg){
        System.out.println("Parent message: "+msg);
    }
}
