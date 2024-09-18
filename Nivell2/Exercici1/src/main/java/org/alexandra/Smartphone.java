package org.alexandra;

public class Smartphone extends Telephone implements Camera, Clock {

    public void takePhoto(){
        System.out.println("Taking a photo");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm ringing");
    }
}
