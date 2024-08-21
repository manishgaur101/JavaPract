package com.oops.encapsulation;

class Sum implements Calculate {
    private int value1;
    private int value2;

    public Sum(int a, int b) {
        this.value1 = a;
        this.value2 = b;
    }

    public void calculation(){
        System.out.println("Sum is: "+(value1+value2));
    }
}
