package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.FloorLamp;
import com.xworkz.isARelation.Lamp;

public class Building {

    public void constructFloor(Lamp lamp){
        lamp.haveSwitch();
        lamp.bePortable();
        lamp.consumeElectricity();
        lamp.haveBulb();
        lamp.produceLight();

        if(lamp instanceof FloorLamp){
            FloorLamp floorLamp = (FloorLamp) lamp;
            ((FloorLamp) lamp).connectSwitch();
        }
    }
}
