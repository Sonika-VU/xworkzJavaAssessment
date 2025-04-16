package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.LightControl;
import com.xworkz.interfaces.connectors.PlantWateringSystem;

public class GardenBot implements PlantWateringSystem, LightControl {
    @Override
    public void startWatering() {
        System.out.println("Running startWatering in GardenBot");
    }

    @Override
    public void stopWatering() {
        System.out.println("Running stopWatering in GardenBot");
    }

    @Override
    public void checkMoisture() {
        System.out.println("Running checkMoisture in GardenBot");
    }


    @Override
    public void turnOn() {
        System.out.println("Running turnOn in GardenBot");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in GardenBot");

    }

    @Override
    public void dim() {
        System.out.println("Running dim in GardenBot");

    }
}
