package com.oops.encapsulation;

class Multiply implements Calculate {
    private int value1;
    private int value2;

    public Multiply(int a, int b) {
        this.value1 = a;
        this.value2 = b;
    }

    @Override
    public void calculation(){
        System.out.println("Multiplication result is: " + (value1* value2));
    }

}
