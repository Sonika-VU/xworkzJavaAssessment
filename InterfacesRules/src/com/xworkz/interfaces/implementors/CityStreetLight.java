package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.StreetLight;

public class CityStreetLight implements StreetLight {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in CityStreetLight");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in CityStreetLight");
    }

    @Override
    public void blink() {
        System.out.println("Running blink in CityStreetLight");
    }
}
