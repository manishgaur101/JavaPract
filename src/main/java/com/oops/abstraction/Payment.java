package com.oops.abstraction;

public abstract class Payment {

    abstract void processAmount(double amount);

    public void paymentDetails(double amount){
        System.out.println("Processing amount of $"+ amount);
    }
}
