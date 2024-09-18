package org.alexandra;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //loads both PercussionInstrument & MusicInstrument.
        //Loads MusicInstrument first since it is PercussionInstrument' Super class.
        System.out.println("Creating first PercussionInstrument instance:");
        PercussionInstrument drum = new PercussionInstrument("drum", new BigDecimal(300));

        //Accesses static method of StringInstrument' Super, that is MusicInstrument static method.
        //StringInstrument is not loaded because we are not accessing its method but its super's method.
        //Since MusicInstrument has been loaded in the previous line it does not load it again.
        System.out.println("Calling StringInstrument.type() (MusicInstrument static method)");
        StringInstrument.type();

        //Loads WindInstrument class through calling static method of windInstrument class.
        System.out.println("Calling WindInstrument static method");
        WindInstrument.comment();

        //WindInstrument class is not loaded again even though we create its first instance now.
        System.out.println("Creating first instance of WindInstrument");
        WindInstrument flute = new WindInstrument("flute", new BigDecimal(800));

        //Loads StringInstrument class
        System.out.println("Creating first instance of StringInstrument:");
        StringInstrument cello = new StringInstrument("cello", new BigDecimal(10000));

        //Does not load StringInstrument class again
        System.out.println("Creating second instance of StringInstrument");
        StringInstrument violin = new StringInstrument("violin", new BigDecimal(10000));
    }
}