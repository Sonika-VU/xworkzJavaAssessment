package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.AlarmSystem;

public class HomeAlarm implements AlarmSystem {

    @Override
    public void arm() {
        System.out.println("Running arm in HomeAlarm");
    }

    @Override
    public void disarm() {
        System.out.println("Running disarm in HomeAlarm");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Running triggerAlarm in HomeAlarm");
    }

    @Override
    public void setSound() {
        System.out.println("Running setSound in HomeAlarm");
    }
}
