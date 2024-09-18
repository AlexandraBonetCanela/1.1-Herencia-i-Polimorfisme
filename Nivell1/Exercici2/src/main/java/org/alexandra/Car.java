package org.alexandra;

public class Car {
    static final String BRAND = "MERCEDES";
    static String model;
    final Integer POWER;

    public Car(String model, Integer power) {
        // POWER is a constant for each object initiated. Once assigned in the constructor, won't be able to be changed again.
        // is the model property.
        Car.model = model;
        this.POWER = power;
    }

    static void stop(){
        System.out.println("The vehicle is stopping");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating");
    }

}
