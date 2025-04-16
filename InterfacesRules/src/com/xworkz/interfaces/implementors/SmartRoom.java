package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.RoomAutomation;

public class SmartRoom implements RoomAutomation {
    @Override
    public void openCurtains() {
        System.out.println("Running openCurtains in SmartRoom");
    }
    @Override
    public void closeCurtains() {
        System.out.println("Running closeCurtains in SmartRoom");
    }
    @Override
    public void turnOnAC() {
        System.out.println("Running turnOnAC in SmartRoom");
    }
}
