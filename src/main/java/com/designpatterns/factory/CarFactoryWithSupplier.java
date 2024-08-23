package com.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CarFactoryWithSupplier {

    //inline variable declaration
    private static final Supplier<Car> SUV = () -> {
        //WebDriverManager.chromeDriver().setup();
        return new SuvImpl();
    };
    private static final Supplier<Car> SEDAN = ()->{return new SedanImpl();};

    private static final Map<String,Supplier<Car>> MAP =  new HashMap<>();

    private CarFactoryWithSupplier() {
    }

    static{
        MAP.put("SUV",SUV);
        MAP.put("SEDAN",SEDAN);
    }

    public static Car getCar(String carType){
        return MAP.get(carType.toUpperCase()).get();
    }
}
