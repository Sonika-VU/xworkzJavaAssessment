package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Guitar;
import com.xworkz.isARelation.Instrument;

public class Musician {

    public void sing(Instrument instrument){
        instrument.buy();
        instrument.play();
        instrument.use();
        instrument.sell();
        instrument.manufacture();

        if(instrument instanceof Guitar){
            Guitar guitar = (Guitar) instrument;
            guitar.compose();
        }
    }
}
