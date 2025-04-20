package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartLight;

public class BedroomLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in BedroomLight");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in BedroomLight");
    }

    @Override
    public void changeColor() {
        System.out.println("Running changeColor in BedroomLight");
    }

    @Override
    public void changeIntensity() {
        System.out.println("Running changeIntensity in BedroomLight");
    }
}
