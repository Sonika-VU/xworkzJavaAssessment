package com.xworkz.isARelation;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("no-arg const of WashingMachine");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in WashingMachine");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in WashingMachine");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in WashingMachine");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in WashingMachine");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in WashingMachine");
    }
}
