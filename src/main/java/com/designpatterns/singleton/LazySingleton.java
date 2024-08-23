package com.designpatterns.singleton;

final class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            /**synchronized the code block for thread safety
            * If two threads come then they will go one by one in this block and since there is no check inside it
             * we will get two instances created. so as solution apply double-checked locking inside the block.
             */
             synchronized (LazySingleton.class)
            {
                if (instance == null) // double-checked locking solution
                    instance = new LazySingleton();
            }
        }
        return instance;
    }
}
