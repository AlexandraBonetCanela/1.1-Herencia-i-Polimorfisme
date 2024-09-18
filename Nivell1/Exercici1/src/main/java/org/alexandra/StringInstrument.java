package org.alexandra;

import java.math.BigDecimal;

public class StringInstrument extends MusicInstrument{

    static{
        System.out.println("->StringInstrument class loaded");
    }

    public StringInstrument(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    protected void play(){
        System.out.println("A String Instrument is playing");
    }
}
