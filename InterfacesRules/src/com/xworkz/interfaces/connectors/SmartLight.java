package com.xworkz.interfaces.connectors;

public interface SmartLight {
    void turnOn();
    void turnOff();
    void changeColor();

    default void changeIntensity(){
        System.out.println("Running changeIntensity in SmartLight");
    }
}
