package com.designpatterns.singleton;

//The Bill Pugh Singleton is a variation of lazy initialization that ensures thread safety without using synchronized blocks.
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class LazyHolder{
        private static final  BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

}
