package com.oops.abstraction;

public class CreditCardPayment extends Payment {

    void processAmount(double amount){
        paymentDetails(amount);
        System.out.println("Payment of $" + amount +" is done by credit card.");
    }
}
