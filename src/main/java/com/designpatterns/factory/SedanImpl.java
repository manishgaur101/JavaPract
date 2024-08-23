package com.designpatterns.factory;

public class SedanImpl implements Car{

    @Override
    public void assemble() {
        System.out.println("Sedan -- assembling");
    }
}
