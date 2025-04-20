package com.xworkz.interfaces.connectors;

public interface Toaster {
    void insertBread();
    void heat();
    void popOut();

    default void charge(){}
}
