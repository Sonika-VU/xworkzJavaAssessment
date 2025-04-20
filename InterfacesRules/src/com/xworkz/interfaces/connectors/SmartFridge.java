package com.xworkz.interfaces.connectors;

public interface SmartFridge {
    void cool();
    void defrost();
    void displayTemp();

    default void keepItems(){

    }
}
