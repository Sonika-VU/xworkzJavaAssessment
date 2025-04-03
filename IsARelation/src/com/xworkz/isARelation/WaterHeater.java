package com.xworkz.isARelation;

public class WaterHeater extends  Appliance{

    public WaterHeater() {
        super();
        System.out.println("no-arg const of WaterHeater");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in WaterHeater");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in WaterHeater");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in WaterHeater");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in WaterHeater");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in WaterHeater");
    }
}
