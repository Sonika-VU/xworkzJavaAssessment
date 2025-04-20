package com.xworkz.interfaces.connectors;

public interface BatteryCharger {
    void startCharging();
    void stopCharging();
    void showBatteryLevel();

    default void store(){

    }
}
