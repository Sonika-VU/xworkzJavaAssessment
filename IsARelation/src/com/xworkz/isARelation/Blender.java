package com.xworkz.isARelation;

public class Blender extends Appliance{

    public Blender() {
        super();
        System.out.println("no-arg const of Blender");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Blender");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in Blender");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in Blender");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in Blender");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Blender");
    }
}
