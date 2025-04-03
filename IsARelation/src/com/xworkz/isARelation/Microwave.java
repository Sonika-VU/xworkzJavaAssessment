package com.xworkz.isARelation;

public class Microwave extends Appliance{
    public Microwave() {
        super();
        System.out.println("no-arg const of Microwave");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Microwave");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in Microwave");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in Microwave");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in Microwave");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Microwave");
    }
}
