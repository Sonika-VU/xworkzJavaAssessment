package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.SmartMirror;

public class SmartMirrorImpl implements SmartMirror {
    public SmartMirrorImpl(){
        System.out.println("no-arg const of SmartMirrorImpl");
    }
    @Override
    public void displayWeather() {
        System.out.println("Running displayWeather in SmartMirrorImpl");
    }
}
