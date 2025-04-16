package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.AlarmSystem;
import com.xworkz.interfaces.connectors.LightControl;

public class Home implements AlarmSystem, LightControl {

    @Override
    public void arm() {
        System.out.println("Running arm in Home");
    }

    @Override
    public void disarm() {
        System.out.println("Running disarm in Home");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Running triggerAlarm in Home");
    }

    @Override
    public void turnOn() {
        System.out.println("Running turnOn in Home");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in Home");
    }

    @Override
    public void dim() {
        System.out.println("Running dim in Home");
    }
}
