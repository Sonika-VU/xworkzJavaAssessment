package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Guitar;
import com.xworkz.isARelation.Instrument;

public class InstrumentRunner {

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        Instrument instrument1 = new Guitar();
        Guitar guitar = new Guitar();

        System.out.println("======================");
        instrument.buy();
        instrument.play();
        instrument.use();
        instrument.sell();
        instrument.manufacture();

        System.out.println("======================");
        instrument1.buy();
        instrument1.play();
        instrument1.use();
        instrument1.sell();
        instrument1.manufacture();

        System.out.println("======================");
        guitar.buy();
        guitar.play();
        guitar.use();
        guitar.sell();
        guitar.manufacture();
    }
}
