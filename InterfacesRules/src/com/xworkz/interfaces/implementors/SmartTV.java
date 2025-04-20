package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartDevice;

public class SmartTV implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in SmartTv");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in SmartTv");
    }

    @Override
    public void restart() {
        System.out.println("Running restart in SmartTv");
    }

    @Override
    public void update() {

    }
}
