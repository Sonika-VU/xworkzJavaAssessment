package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new Blender();
        Blender blender = new Blender();

        System.out.println("============================");
        appliance.turnOn();
        appliance.adjustSettings();
        appliance.scheduleTask();
        appliance.showStatus();
        appliance.turnOff();

        System.out.println("============================");
        appliance1.turnOn();
        appliance1.adjustSettings();
        appliance1.scheduleTask();
        appliance1.showStatus();
        appliance1.turnOff();

        System.out.println("============================");
        blender.turnOn();
        blender.adjustSettings();
        blender.scheduleTask();
        blender.showStatus();
        blender.turnOff();
    }
}
