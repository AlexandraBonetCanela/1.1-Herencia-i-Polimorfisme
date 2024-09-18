package org.alexandra;

import java.math.BigDecimal;

public class PercussionInstrument extends MusicInstrument {

    static{
        System.out.println("->PercussionInstrument class loaded");
    }

    public PercussionInstrument(String name, BigDecimal price) {
        super(name, price);
    }

    public void play(){
        System.out.println("A percussion instrument is playing");
    }
}
