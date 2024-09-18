package org.alexandra;

import java.math.BigDecimal;

public abstract class MusicInstrument {
    static{
        System.out.println("->MusicInstrument class loaded");
    }
    protected String name;
    protected BigDecimal price;

    public MusicInstrument(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    protected abstract void play();

    protected static void type(){
        System.out.println("->(static MusicInstrument member accessed)");
    }

}
