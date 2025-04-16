package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Elevator;

public class BuildingElevator implements Elevator {
    @Override
    public void goUp() {
        System.out.println("Running goUp in BuildingElevator");
    }

    @Override
    public void goDown() {
        System.out.println("Running goDown in BuildingElevator");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in BuildingElevator");
    }
}
