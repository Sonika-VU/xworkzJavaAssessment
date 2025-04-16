package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.AirConditioner;

public class SplitAC implements AirConditioner {
    @Override
    public void powerOn() {
        System.out.println("Running powerOn in SplitAC");
    }

    @Override
    public void powerOff() {
        System.out.println("Running powerOff in SplitAC");
    }

    @Override
    public void swing() {
        System.out.println("Running swing in SplitAC");
    }
}
