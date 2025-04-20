package com.xworkz.interfaces.connectors;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    void restart();

    default void update(){}
}
