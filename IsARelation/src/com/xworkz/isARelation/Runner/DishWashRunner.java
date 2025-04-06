package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.DishWasher;

public class DishWashRunner {

    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new DishWasher();
        DishWasher dishWasher = new DishWasher();

        System.out.println("===========================");
        appliance.turnOn();
        appliance.adjustSettings();
        appliance.scheduleTask();
        appliance.showStatus();
        appliance.turnOff();

        System.out.println("===========================");
        appliance1.turnOn();
        appliance1.adjustSettings();
        appliance1.scheduleTask();
        appliance1.showStatus();
        appliance1.turnOff();

        System.out.println("===========================");
        dishWasher.turnOn();
        dishWasher.adjustSettings();
        dishWasher.scheduleTask();
        dishWasher.showStatus();
        dishWasher.turnOff();
    }
}
