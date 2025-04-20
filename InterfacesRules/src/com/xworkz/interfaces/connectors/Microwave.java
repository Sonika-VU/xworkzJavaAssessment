package com.xworkz.interfaces.connectors;

public interface Microwave {
    void start();
    void stop();
    void openDoor();

    default void heat(){

    }
}
