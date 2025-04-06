package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.WaterHeater;

public class WaterHeaterRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new WaterHeater();
        WaterHeater waterHeater = new WaterHeater();

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

        waterHeater.turnOn();
        waterHeater.showStatus();
        waterHeater.scheduleTask();
        waterHeater.adjustSettings();
        waterHeater.turnOff();
        System.out.println("==========================");
    }
}
