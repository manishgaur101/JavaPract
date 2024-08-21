package com.oops.polymorphism;

public class Child1 extends Parent {

    private String name = "MANISH";

    //overriding
    public void show(){
        System.out.println("Child Show");
    }

    public void getName()
    {
        System.out.println(name);
    }
}
