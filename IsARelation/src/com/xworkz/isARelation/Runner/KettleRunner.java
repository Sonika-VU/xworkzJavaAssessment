package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.Kettle;

public class KettleRunner {
    public static void main(String[] args) {
        Appliance appliance =new Appliance();
        Appliance appliance1 = new Kettle();
        Kettle kettle = new Kettle();

        System.out.println("==========================");

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

        kettle.turnOn();
        kettle.showStatus();
        kettle.scheduleTask();
        kettle.adjustSettings();
        kettle.turnOff();
    }
}
