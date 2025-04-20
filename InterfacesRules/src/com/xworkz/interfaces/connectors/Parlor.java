package com.xworkz.interfaces.connectors;

public interface Parlor {
    void hairCut();
    void massage();
    void pedicure();

    default void makeUp(){

    }
}
