package com.xworkz.interfaces.connectors;

public interface ElectricKettle {
    void startBoiling();
    void stopBoiling();
    void showTemperature();

    default void adjustHeat(){}
}
