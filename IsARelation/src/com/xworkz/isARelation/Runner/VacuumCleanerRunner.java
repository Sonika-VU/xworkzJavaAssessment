package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.VacuumCleaner;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        Appliance appliance1 = new VacuumCleaner();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

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

        vacuumCleaner.turnOn();
        vacuumCleaner.showStatus();
        vacuumCleaner.scheduleTask();
        vacuumCleaner.adjustSettings();
        vacuumCleaner.turnOff();
    }
}
