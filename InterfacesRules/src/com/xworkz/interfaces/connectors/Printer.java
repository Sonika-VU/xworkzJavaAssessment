package com.xworkz.interfaces.connectors;

public interface Printer {
    void print();
    void scan();
    void copy();

    default void addPaper(){}
}
