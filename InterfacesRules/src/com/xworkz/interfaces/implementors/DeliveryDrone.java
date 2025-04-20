package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Drone;

public class DeliveryDrone implements Drone {
    @Override
    public void takeOff() {
        System.out.println("Running takeOff in DeliveryDrone");
    }

    @Override
    public void fly() {
        System.out.println("Running fly in DeliveryDrone");
    }

    @Override
    public void land() {
        System.out.println("Running land in DeliveryDrone");
    }

    @Override
    public void capture() {

    }
}
