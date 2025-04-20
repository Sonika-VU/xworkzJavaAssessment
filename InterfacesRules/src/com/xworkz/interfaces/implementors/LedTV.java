package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Television;

public class LedTV implements Television {
    @Override
    public void powerOn() {
        System.out.println("Running powerOn in LedTV");
    }

    @Override
    public void powerOff() {
        System.out.println("Running powerOff in LedTV");
    }

    @Override
    public void mute() {
        System.out.println("Running mute in LedTV");
    }

    @Override
    public void display() {
        System.out.println("Running display in LedTV");
    }
}
