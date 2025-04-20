package com.xworkz.interfaces.connectors;

public interface SprayingSystem {
    void sprayWater();
    void sprayFertilizer();
    void shutdownSystem();

    default void charge(){

    }
}
