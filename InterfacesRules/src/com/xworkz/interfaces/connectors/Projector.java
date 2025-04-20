package com.xworkz.interfaces.connectors;

public interface Projector {
    void turnOn();
    void turnOff();
    void adjustFocus();

    default void set(){

    }
}
