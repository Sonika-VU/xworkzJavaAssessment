package com.xworkz.interfaces.connectors;

public interface VehicleSystem {
    void start();
    void stop();
    void accelerate();

    default void clean(){
        System.out.println("Running clean in VehicleSystem");
    }
}
