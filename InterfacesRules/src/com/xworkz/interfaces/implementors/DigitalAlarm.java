package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.AlarmClock;

public class DigitalAlarm implements AlarmClock {
    @Override
    public void setAlarm() {
        System.out.println("Running setAlarm in DigitalAlarm");
    }

    @Override
    public void ring() {
        System.out.println("Running ring in DigitalAlarm");
    }

    @Override
    public void snooze() {
        System.out.println("Running snooze in DigitalAlarm");
    }

    @Override
    public void tellTime() {
        System.out.println("Running tellTime in DigitalAlarm");

    }
}
