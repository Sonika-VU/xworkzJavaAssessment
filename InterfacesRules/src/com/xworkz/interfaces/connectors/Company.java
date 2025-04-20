package com.xworkz.interfaces.connectors;

public interface Company {

    void entryTiming();
    void signOff();
    void deadline();

    default void completeTask(){

    }
}
