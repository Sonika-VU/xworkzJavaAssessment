package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.WateringService;

public class GardenManager {
    WateringService wateringService;

    public GardenManager(WateringService wateringService){
        this.wateringService = wateringService;
        System.out.println("wateringService-arg const of GardenManager");
    }

    public void waterPlants(){
        System.out.println("Running waterPlants in GardenManager");
        if(this.wateringService != null){
            this.wateringService.provideWater();
        }
    }
}
