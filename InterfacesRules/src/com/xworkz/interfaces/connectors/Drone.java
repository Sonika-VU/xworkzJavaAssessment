package com.xworkz.interfaces.connectors;

public interface Drone {

    void takeOff();
    void fly();
    void land();

    default void capture(){

    }
}
