package com.xworkz.isARelation;

public class Toaster extends  Appliance{

    public Toaster() {
        super();
        System.out.println("no-arg const of Toaster");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Toaster");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in Toaster");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in Toaster");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in Toaster");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Toaster");
    }


}
