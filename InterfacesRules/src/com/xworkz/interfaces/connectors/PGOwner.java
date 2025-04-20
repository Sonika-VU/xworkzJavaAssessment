package com.xworkz.interfaces.connectors;

public interface PGOwner {
    void inTiming();
    void deposit();
    void food();

    default void rent(){

    }
}
