package com.xworkz.interfaces.connectors;

public interface WashingMachine {

    void startWash();
    void rinse();
    void spin();

    default void setTimer(){

    }
}
