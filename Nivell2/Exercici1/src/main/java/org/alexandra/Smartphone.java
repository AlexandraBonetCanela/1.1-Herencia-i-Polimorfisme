package org.alexandra;

public class Smartphone extends Telephone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand,model);
    }
    public void takePhoto(){
        System.out.println("Taking a photo");
    }

    public void alarm() {
        System.out.println("Alarm ringing");
    }
}
