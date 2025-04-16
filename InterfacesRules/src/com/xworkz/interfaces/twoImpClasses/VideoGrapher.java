package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.Camera;
import com.xworkz.interfaces.connectors.Drone;

public class VideoGrapher implements Drone, Camera {
    @Override
    public void capture() {
        System.out.println("Running capture in VideoGrapher");
    }

    @Override
    public void record() {
        System.out.println("Running record in VideoGrapher");

    }

    @Override
    public void zoom() {
        System.out.println("Running zoom in VideoGrapher");

    }

    @Override
    public void takeOff() {
        System.out.println("Running takeOff in VideoGrapher");

    }

    @Override
    public void fly() {
        System.out.println("Running fly in VideoGrapher");

    }

    @Override
    public void land() {
        System.out.println("Running land in VideoGrapher");

    }
}
