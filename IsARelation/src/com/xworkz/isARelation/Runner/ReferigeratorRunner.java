package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.Refrigerator;

public class ReferigeratorRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new Refrigerator();
        Refrigerator refrigerator = new Refrigerator();

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

        refrigerator.turnOn();
        refrigerator.showStatus();
        refrigerator.scheduleTask();
        refrigerator.adjustSettings();
        refrigerator.turnOff();
        System.out.println("==========================");


    }
}
