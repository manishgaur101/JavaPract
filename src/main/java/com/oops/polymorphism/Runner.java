package com.oops.polymorphism;

public class Runner {
    public static void main(String[] args) {
        //upcasting
        Parent parent = new Child1();
        parent.show();// Child show method body will be called.


        //downcasting to call child specific methods, this is risky and should be rarely used
        Child1 childObj = (Child1)parent;
        childObj.getName();

    }
}
