package com.xworkz.interfaces.connectors;

public interface Hospital {
    void treatPatients();
    void takeBlood();
    void makeSurgery();

    default void giceTablets(){

    }
}
