package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Projector;

public class HomeTheaterProjector implements Projector {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in HomeTheaterProjector");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in HomeTheaterProjector");
    }

    @Override
    public void adjustFocus() {
        System.out.println("Running adjustFocus in HomeTheaterProjector");
    }
}
