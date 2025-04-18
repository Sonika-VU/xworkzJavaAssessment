package com.xworkz.interfaces.connectors;

public interface AirConditioner {
    void powerOn();
    void powerOff();
    void swing();



    default void fix(){
        System.out.println("Running fix in AirConditioner");
    }
}
