package org.alexandra;

import java.math.BigDecimal;

public class StringInstrument extends MusicInstrument{

    static{
        System.out.println("->StringInstrument class loaded");
    }

    public StringInstrument(String name, BigDecimal price) {
        super(name,price);
    }

    protected void play(){
        System.out.println("A String Instrument is playing");
    }
}
