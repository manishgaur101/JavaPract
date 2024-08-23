package com.designpatterns.factory;

public class CarFactory {

    private CarFactory() {
    }

    /**
     * Factory does come to know which class is going to instantiate at runtime when client pass value.
     * Disadvantage - many if else conditions we need to put. So solution of this is
     * factory class with supplier.
     * @param carType
     * @return
     */
    public static Car getCar(String carType){
       if(carType.equalsIgnoreCase("SUV")){
           return new SuvImpl();
       }
       else if (carType.equalsIgnoreCase("sedan")){
           return new SedanImpl();
       }
       return null;

    }
}
