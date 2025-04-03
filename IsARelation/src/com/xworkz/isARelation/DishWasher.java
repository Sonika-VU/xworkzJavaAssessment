package com.xworkz.isARelation;

public class DishWasher extends  Appliance {

    public DishWasher() {
        super();
        System.out.println("no-arg const of DishWasher");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in DishWasher");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in DishWasher");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in DishWasher");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in DishWasher");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in DishWasher");
    }
}
