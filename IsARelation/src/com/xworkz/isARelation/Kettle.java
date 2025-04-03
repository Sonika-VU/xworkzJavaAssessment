package com.xworkz.isARelation;

public class Kettle extends  Appliance{

    public Kettle() {
        super();
        System.out.println("no-arg const of Kettle");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Kettle");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in Kettle");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in Kettle");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in Kettle");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Kettle");
    }
}
