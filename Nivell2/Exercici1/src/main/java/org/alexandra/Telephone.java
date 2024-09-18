package org.alexandra;

public class Telephone {
    protected String brand;
    protected String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
}
