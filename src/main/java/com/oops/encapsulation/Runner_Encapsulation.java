package com.oops.encapsulation;

public class Runner_Encapsulation {
    public static void main(String[] args) {
        Car create = new Car();
        System.out.println(create.getSpeed());
        create.setSpeed(100);
        System.out.println(create.getSpeed());

        Calculate calculate = FactoryClass.doCalculate("sum",3,34);
        calculate.calculation();

        calculate = FactoryClass.doCalculate("multiply",3,34);
        calculate.calculation();

        calculate = FactoryClass.doCalculate("subtraction",3,34);
        calculate.calculation();
    }
}
