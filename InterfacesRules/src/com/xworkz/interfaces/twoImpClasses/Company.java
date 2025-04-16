package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.AirConditioner;
import com.xworkz.interfaces.connectors.FireAlarm;

public class Company implements FireAlarm, AirConditioner {
    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void swing() {

    }

    @Override
    public void detectSmoke() {

    }

    @Override
    public void triggerAlarm() {

    }

    @Override
    public void resetAlarm() {

    }
}
