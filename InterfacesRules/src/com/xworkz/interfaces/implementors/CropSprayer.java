package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SprayingSystem;

public class CropSprayer implements SprayingSystem {
    @Override
    public void sprayWater() {
        System.out.println("Running sprayWater in CropSprayer");
    }

    @Override
    public void sprayFertilizer() {
        System.out.println("Running sprayFertilizer in CropSprayer");
    }

    @Override
    public void shutdownSystem() {
        System.out.println("Running shutdownSystem in CropSprayer");
    }
}
