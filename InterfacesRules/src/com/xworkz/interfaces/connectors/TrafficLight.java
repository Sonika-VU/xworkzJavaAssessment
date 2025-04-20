package com.xworkz.interfaces.connectors;

public interface TrafficLight {
    void red();
    void yellow();
    void green();

    default void checkTime(){
        System.out.println("Running checkTime in TrafficLight");
    }
}
