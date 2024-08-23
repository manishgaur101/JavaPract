package com.designpatterns.singleton;

class EarlyInitializationSingleton {

    private static volatile EarlyInitializationSingleton instance =  new EarlyInitializationSingleton();
    private EarlyInitializationSingleton() {
    }

    public static EarlyInitializationSingleton getInstance(){
        return instance;
    }

}
