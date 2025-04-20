package com.xworkz.interfaces.connectors;

public interface AlarmSystem {
    void arm();
    void disarm();
    void triggerAlarm();

    default void setSound(){

    }
}
