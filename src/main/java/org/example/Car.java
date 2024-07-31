package org.example;

public class Car {
    private String model;
    private String color;

    // Private constructor to prevent direct instantiation
    private Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Static factory method
    public static Car createCar(String model, String color) {
        // Additional logic can be added here
        return new Car(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Creating an instance using the static method
        Car car = Car.createCar("Sedan", "Red");
        System.out.println(car);
    }
}
