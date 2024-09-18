package org.alexandra;

import java.math.BigDecimal;

public abstract class MusicInstrument {
    static{
        System.out.println("->MusicInstrument class loaded");
    }
    protected String name;
    protected BigDecimal price;

    protected abstract void play();

    protected static void type(){
        System.out.println("->(static MusicInstrument member accessed)");
    }

}
