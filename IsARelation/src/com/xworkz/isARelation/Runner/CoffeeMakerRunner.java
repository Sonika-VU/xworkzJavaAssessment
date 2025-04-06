package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.CoffeeMaker;

public class CoffeeMakerRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new CoffeeMaker();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.println("===============================");
        appliance.turnOn();
        appliance.showStatus();
        appliance.scheduleTask();
        appliance.adjustSettings();
        appliance.turnOff();

        System.out.println("===============================");
        appliance1.turnOn();
        appliance1.showStatus();
        appliance1.scheduleTask();
        appliance1.adjustSettings();
        appliance1.turnOff();

        System.out.println("===============================");
        coffeeMaker.turnOn();
        coffeeMaker.showStatus();
        coffeeMaker.scheduleTask();
        coffeeMaker.adjustSettings();
        coffeeMaker.turnOff();
    }
}
