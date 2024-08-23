package com.designpatterns.factory;

public class ClientCode {
    public static void main(String[] args) {
        Car car  = CarFactory.getCar("suv");
        car.assemble();

        CarFactoryWithSupplier.getCar("sedan").assemble();
    }
}
