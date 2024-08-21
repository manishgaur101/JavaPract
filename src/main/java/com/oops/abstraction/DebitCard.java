package com.oops.abstraction;

public class DebitCard extends Payment {

    void processAmount(double amount){
        paymentDetails(amount);
        System.out.println("Payment of $ " + amount + " is done by debit card.");
    }
}
