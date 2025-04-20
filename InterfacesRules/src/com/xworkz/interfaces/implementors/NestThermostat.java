package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Thermostat;

public class NestThermostat implements Thermostat {
    @Override
    public void increaseTemp() {
        System.out.println("Running increaseTemp in NestThermostat");
    }

    @Override
    public void decreaseTemp() {
        System.out.println("Running decreaseTemp in NestThermostat");
    }

    @Override
    public void showCurrentTemp() {
        System.out.println("Running showCurrentTemp in NestThermostat");
    }

    @Override
    public void addFeature() {
        System.out.println("Running addFeature in NestThermostat");

    }
}
