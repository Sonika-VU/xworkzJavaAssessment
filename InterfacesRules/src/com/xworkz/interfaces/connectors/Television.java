package com.xworkz.interfaces.connectors;

public interface Television {
    void powerOn();
    void powerOff();
    void mute();

    default void display(){

    }
}
