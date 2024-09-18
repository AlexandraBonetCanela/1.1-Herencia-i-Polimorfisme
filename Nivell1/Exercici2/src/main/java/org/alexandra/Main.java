package org.alexandra;

public class Main {
    public static void main(String[] args) {
        //Static final BRAND can be called before creating instance of class
        System.out.println("Brand: " + Car.BRAND);
        System.out.println("Model: " + Car.model);

        //Static method
        Car.stop();

        //Initiate Car class
        Car pikachu = new Car("Pikachu");

        //Properties initiated in the constructor:
        System.out.println("Power:" + pikachu.POWER);
        System.out.println("Model: " + Car.model);

        // Non-Static method
        pikachu.accelerate();
    }
}