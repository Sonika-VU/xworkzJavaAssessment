package com.xworkz.interfaces.connectors;

public interface AquariumSystem {
    void feedFish();
    void cleanTank();
    void checkTemperature();

    default void addLights(){}
}
