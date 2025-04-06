package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.FloorLamp;
import com.xworkz.isARelation.Lamp;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Lamp lamp1 = new FloorLamp();
        FloorLamp floorLamp = new FloorLamp();

        System.out.println("=======================");
        lamp.haveSwitch();
        lamp.bePortable();
        lamp.consumeElectricity();
        lamp.haveBulb();
        lamp.produceLight();

        System.out.println("=======================");
        lamp1.haveSwitch();
        lamp1.bePortable();
        lamp1.consumeElectricity();
        lamp1.haveBulb();
        lamp1.produceLight();

        System.out.println("=======================");
        floorLamp.haveSwitch();
        floorLamp.bePortable();
        floorLamp.consumeElectricity();
        floorLamp.haveBulb();
        floorLamp.produceLight();
    }
}
