package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.FireAlarm;

public class OfficeFireAlarm implements FireAlarm {
    @Override
    public void detectSmoke() {
        System.out.println("Running detectSmoke in OfficeFireAlarm");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Running triggerAlarm in OfficeFireAlarm");
    }

    @Override
    public void resetAlarm() {
        System.out.println("Running resetAlarm in OfficeFireAlarm");
    }
}
