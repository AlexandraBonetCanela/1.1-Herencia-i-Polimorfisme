package org.alexandra;

public class Main {
    public static void main(String[] args) {
        //Static final BRAND can be called before creating any instances of the Car class
        //Before creating any instance we can already access static methods and properties
        System.out.println("Brand: " + .getBRAND());
        Car.stop();

        //Even though Car.model is static it is only assigned a value when creating an object
        System.out.println("Model: " + Car.model);

        //Initiate first Car instance. We assign static Car.model property a value through constructor
        Car car1 = new Car("Pikachu", 900);
        System.out.println("car1 Model: " + Car.model);
        System.out.println("car1 Power" + car1.POWER);
        car1.accelerate();

        //Initiate second Car instance. We assign static Car.model property a new value through constructor
        Car car2 = new Car("Goku", 700);
        System.out.println("Car Model: " + Car.model);
        System.out.println("car2 Power" + car2.POWER);

        //Access car1 power to validate creating a car2 hasn't changed its value sine it is constant at instance level.
        System.out.println("car1 Power" + car1.POWER);
    }

}