package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartMirror;

public class MakeupRoomMirror implements SmartMirror {
    @Override
    public void showWeather() {
        System.out.println("Running showWeather in BathroomMirror");
    }

    @Override
    public void showTime() {
        System.out.println("Running showTime in BathroomMirror");
    }

    @Override
    public void turnOffDisplay() {
        System.out.println("Running turnOffDisplay in BathroomMirror");

    }
}
