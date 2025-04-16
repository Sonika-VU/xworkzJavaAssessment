package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.AlarmSystem;
import com.xworkz.interfaces.connectors.GateControl;

public class SmartSecurity implements AlarmSystem, GateControl {
    @Override
    public void arm() {
        System.out.println("Running arm in SmartSecurity");
    }

    @Override
    public void disarm() {
        System.out.println("Running disarm in SmartSecurity");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Running triggerAlarm in SmartSecurity");
    }

    @Override
    public void openGate() {
        System.out.println("Running openGate in SmartSecurity");
    }

    @Override
    public void closeGate() {
        System.out.println("Running closeGate in SmartSecurity");
    }

    @Override
    public void lockGate() {
        System.out.println("Running lockGate in SmartSecurity");
    }
}
