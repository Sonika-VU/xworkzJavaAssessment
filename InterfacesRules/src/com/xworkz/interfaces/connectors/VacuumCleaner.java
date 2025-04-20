package com.xworkz.interfaces.connectors;

public interface VacuumCleaner {

    void start();
    void stop();
    void autoClean();


    default void sweep(){}
}
