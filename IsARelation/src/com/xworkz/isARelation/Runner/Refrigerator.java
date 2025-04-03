package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;

public class Refrigerator extends Appliance {

    public Refrigerator() {
        super();
        System.out.println("no-arg const of Refrigerator");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in Refrigerator");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in Refrigerator");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in Refrigerator");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in Refrigerator");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in Refrigerator");
    }
}
