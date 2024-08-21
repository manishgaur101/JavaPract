package com.oops.encapsulation;

public class FactoryClass {

    public static Calculate doCalculate(String action, int firstavlue, int secondvalue){
        switch (action.toLowerCase()){
            case "sum":
                return new Sum(firstavlue,secondvalue);
            case "multiply":
                return new Multiply(firstavlue,secondvalue);
            default:
                throw new IllegalArgumentException("Unknown action. Only allowed actions are: sum/multiply.");
        }
    }

}
