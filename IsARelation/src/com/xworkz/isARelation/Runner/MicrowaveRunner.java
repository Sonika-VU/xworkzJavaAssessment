package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new Microwave();
        Microwave microwave = new Microwave();

        appliance.turnOn();
        appliance.showStatus();
        appliance.scheduleTask();
        appliance.adjustSettings();
        appliance.turnOff();
        System.out.println("==========================");

        appliance1.turnOn();
        appliance1.showStatus();
        appliance1.scheduleTask();
        appliance1.adjustSettings();
        appliance1.turnOff();
        System.out.println("==========================");

        microwave.turnOn();
        microwave.showStatus();
        microwave.scheduleTask();
        microwave.adjustSettings();
        microwave.turnOff();
        System.out.println("==========================");


    }
}
