package org.alexandra;

public class Car {
    static final String BRAND = "MERCEDES";
    static String model;
    final Long POWER;

    public Car(String model) {
        // Since BRAND and POWER are constants, the only one that can be initialized
        // is the model property.
        Car.model = model;
        this.POWER = 900L;
    }

    static void stop(){
        System.out.println("The vehicle is stopping");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating");
    }

}
