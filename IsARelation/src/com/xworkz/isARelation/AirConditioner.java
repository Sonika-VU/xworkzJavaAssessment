package com.xworkz.isARelation;

public class AirConditioner extends Appliance{
    public AirConditioner() {
        super();
        System.out.println("no-arg const of HairDryer");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in AirConditioner");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in AirConditioner");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in AirConditioner");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in AirConditioner");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in AirConditioner");
    }
}
