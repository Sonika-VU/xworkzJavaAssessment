package com.xworkz.interfaces.connectors;

public interface SmartWatch {
    void showTime();
    void trackSteps();
    void measureHeartRate();

    default void charge(){

    }
}
