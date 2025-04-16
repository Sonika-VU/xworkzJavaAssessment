package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.PlantWateringSystem;

public class GardenWateringSystem implements PlantWateringSystem {
    @Override
    public void startWatering() {
        System.out.println("Running startWatering in GardenWateringSystem");
    }

    @Override
    public void stopWatering() {
        System.out.println("Running stopWatering in GardenWateringSystem");
    }

    @Override
    public void checkMoisture() {
        System.out.println("Running checkMoisture in GardenWateringSystem");
    }
}
