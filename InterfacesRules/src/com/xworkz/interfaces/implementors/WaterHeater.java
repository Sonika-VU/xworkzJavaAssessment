package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Heater;

public class WaterHeater implements Heater {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in WaterHeater");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in WaterHeater");
    }

    @Override
    public void setToMax() {
        System.out.println("Running setTOMax in WaterHeater");
    }
}
