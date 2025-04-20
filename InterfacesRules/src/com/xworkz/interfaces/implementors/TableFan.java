package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Fan;

public class TableFan implements Fan {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in TableFan");
    }


    @Override
    public void turnOff() {
        System.out.println("Running turnOff in TableFan");
    }

    @Override
    public void rotate() {
        System.out.println("Running rotate in TableFan");
    }
}
