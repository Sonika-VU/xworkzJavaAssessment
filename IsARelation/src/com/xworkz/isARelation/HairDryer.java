package com.xworkz.isARelation;

public class HairDryer extends Appliance{

    public HairDryer() {
        super();
        System.out.println("no-arg const of HairDryer");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in HairDryer");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in HairDryer");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in HairDryer");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in HairDryer");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in HairDryer");
    }
}
