package com.xworkz.interfaces.connectors;

public interface Camera {

    void capture();
    void record();
    void zoom();

    default void charge(){
        System.out.println("Running charge in Camera");
    }
}
