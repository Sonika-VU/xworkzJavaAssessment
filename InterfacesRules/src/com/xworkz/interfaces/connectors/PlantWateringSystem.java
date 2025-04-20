package com.xworkz.interfaces.connectors;

public interface PlantWateringSystem
{
    void startWatering();
    void stopWatering();
    void checkMoisture();

    default void charge(){

    }
}
