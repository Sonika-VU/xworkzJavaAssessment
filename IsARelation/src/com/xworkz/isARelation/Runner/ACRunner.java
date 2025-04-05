package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.AirConditioner;
import com.xworkz.isARelation.Appliance;

public class ACRunner {
    public static void main(String[] args) {
        Appliance appliance1 = new Appliance();
        Appliance appliance2 = new AirConditioner();
        AirConditioner airConditioner = new AirConditioner();

        appliance1.turnOn();
        appliance1.adjustSettings();
        appliance1.scheduleTask();
        appliance1.showStatus();
        appliance1.turnOff();

        System.out.println("=======================");
        appliance2.turnOn();
        appliance2.adjustSettings();
        appliance2.scheduleTask();
        appliance2.showStatus();
        appliance2.turnOff();

        System.out.println("===========================");
        airConditioner.turnOn();
        airConditioner.adjustSettings();
        airConditioner.scheduleTask();
        airConditioner.showStatus();
        airConditioner.turnOff();
    }
}
