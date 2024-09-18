package org.alexandra;

import java.math.BigDecimal;

public class WindInstrument extends MusicInstrument {

    static{
        System.out.println("->WindInstrument class loaded");
    }

    public WindInstrument(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
    protected void play() {
        System.out.println("A Wind Instrument is playing");
    }

    protected static void comment(){
        System.out.println("->(static WindInstrument member accessed)");
    }
}
