package com.oops.encapsulation;

public class Car {
    private String model;
    private String engine;
    private int speed = 40;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0 || speed > 90){
            System.out.println("Allowed speed should be between 0 to 80.");
            return;
        }
        this.speed = speed;
    }
}
