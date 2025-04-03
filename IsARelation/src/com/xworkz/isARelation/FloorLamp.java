package com.xworkz.isARelation;

public class FloorLamp extends Lamp {
    public FloorLamp() {
        super();
        System.out.println("no-arg const of FloorLamp");
    }

    {
        super.produceLight();
        System.out.println("Running produceLight in FloorLamp");
    }

    {
        super.consumeElectricity();
        System.out.println("Running consumeElectricity in FloorLamp");
    }

    {
        super.haveSwitch();
        System.out.println("Running haveSwitch in FloorLamp");
    }

    {
        super.bePortable();
        System.out.println("Running bePortable in FloorLamp");
    }

    {
        super.haveBulb();
        System.out.println("Running haveBulb in FloorLamp");
    }
}
