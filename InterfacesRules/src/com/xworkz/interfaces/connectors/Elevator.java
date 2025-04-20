package com.xworkz.interfaces.connectors;

public interface Elevator {

    void goUp();
    void goDown();
    void stop();

    default void start(){
        System.out.println("Running start in Elevator");
    }
}
