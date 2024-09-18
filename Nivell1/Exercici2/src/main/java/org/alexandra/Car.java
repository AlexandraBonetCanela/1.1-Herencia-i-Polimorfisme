package org.alexandra;

public class Car {
    protected static final String BRAND = "MERCEDES";
    private static String model;
    private final Integer POWER;

    public static String getModel() {
        return model;
    }

    public Integer getPOWER() {
        return POWER;
    }

    public String getBRAND() {
        return BRAND;
    }


    public Car(String model, Integer power) {
        // POWER is a constant for each object initiated. Once assigned in the constructor, won't be able to be changed again.
        // is the model property.
        Car.model = model;
        this.POWER = power;
    }

    public static void stop(){
        System.out.println("The vehicle is stopping");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating");
    }

}