package com.xworkz.interfaces.connectors;

public interface SmartMirror {
    void showWeather();
    void showTime();
    void turnOffDisplay();

    default void adjustLight(){

    }
}
