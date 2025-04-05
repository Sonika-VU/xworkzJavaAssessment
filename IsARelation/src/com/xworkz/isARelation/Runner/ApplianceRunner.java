package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.WashingMachine;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new WashingMachine();
        WashingMachine washingMachine = new WashingMachine();

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

        washingMachine.turnOn();
        washingMachine.showStatus();
        washingMachine.scheduleTask();
        washingMachine.adjustSettings();
        washingMachine.turnOff();
        System.out.println("==========================");
    }
}
