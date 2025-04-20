package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.VehicleSystem;

public class Car implements VehicleSystem {

    @Override
    public void start() {
        System.out.println("Running start in Car");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Running accelerate in Car");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in Car");
    }
}
