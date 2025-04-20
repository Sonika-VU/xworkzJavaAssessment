package com.xworkz.interfaces.connectors;

public interface StreetLight {
    void turnOn();
    void turnOff();
    void blink();

    default void changeIntensity(){
        System.out.println("Running changeIntensity in SmartLight");
    }
}
