package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.AquariumSystem;

public class SmartAquarium implements AquariumSystem {
    @Override
    public void feedFish() {
        System.out.println("Running feedFish in SmartAquarium");
    }

    @Override
    public void cleanTank() {
        System.out.println("Running cleanTank in SmartAquarium");
    }

    @Override
    public void checkTemperature() {
        System.out.println("Running checkTemperature in SmartAquarium");
    }

    @Override
    public void addLights() {

    }
}
