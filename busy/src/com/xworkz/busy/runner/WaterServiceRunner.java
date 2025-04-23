package com.xworkz.busy.runner;

import com.xworkz.busy.external.GardenManager;
import com.xworkz.busy.internal.implementor.WaterIrrigationImpl;
import com.xworkz.busy.internal.rules.WateringService;

public class WaterServiceRunner {
    public static void main(String[] args) {
        WateringService wateringService = new WaterIrrigationImpl();
        GardenManager gardenManager = new GardenManager(wateringService);

        gardenManager.waterPlants();
    }
}
