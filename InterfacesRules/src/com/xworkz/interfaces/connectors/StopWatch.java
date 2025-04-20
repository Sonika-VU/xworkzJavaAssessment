package com.xworkz.interfaces.connectors;

public interface StopWatch {
    void start();
    void stop();
    void reset();

    default void display(){
        System.out.println("Running display in StopWatch");
    }
}
