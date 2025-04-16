package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SprinklerSystem;

public class GardenSprinkler implements SprinklerSystem {
    @Override
    public void startSprinklers() {
        System.out.println("Running startSprinklers in GardenSprinkler");
    }

    @Override
    public void stopSprinklers() {
        System.out.println("Running stopSprinklers in GardenSprinkler");
    }

    @Override
    public void testSystem() {
        System.out.println("Running testSystem in GardenSprinkler");
    }
}
