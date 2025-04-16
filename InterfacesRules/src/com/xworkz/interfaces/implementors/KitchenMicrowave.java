package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Microwave;

public class KitchenMicrowave implements Microwave {
    @Override
    public void start() {
        System.out.println("Running start in KitchenMicrowave");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in KitchenMicrowave");
    }

    @Override
    public void openDoor() {
        System.out.println("Running openDoor in KitchenMicrowave");
    }
}
