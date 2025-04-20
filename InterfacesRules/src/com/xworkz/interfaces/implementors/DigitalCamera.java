package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Camera;

public class DigitalCamera implements Camera {
    @Override
    public void capture() {
        System.out.println("Running capture in DigitalCamera");
    }

    @Override
    public void record() {
        System.out.println("Running record in DigitalCamera");
    }

    @Override
    public void zoom() {
        System.out.println("Running zoom in DigitalCamera");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in digitalCamera");
    }
}
