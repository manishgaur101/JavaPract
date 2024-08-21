package com.oops.abstraction;

public class Runner {
    public static void main(String[] args) {
        // In below code client knows about the child classes so to avoid that we use factory pattern.
        Payment creditCardPayment  = new CreditCardPayment();
        Payment debitCardPayment  = new DebitCard();

        // doing the processing with Interface type instance, this way client does not know how the implementation is done
        creditCardPayment.processAmount(709.90);
        debitCardPayment.processAmount(600);
    }
}
