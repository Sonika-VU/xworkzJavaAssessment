package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.LightControl;

public class SmartLight implements LightControl {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in SmartBulb");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in SmartBulb");
    }
    @Override
    public void dim() {
        System.out.println("Running dim in SmartBulb");
    }
}
