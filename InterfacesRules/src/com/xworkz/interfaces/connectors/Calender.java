package com.xworkz.interfaces.connectors;

public interface Calender {
    void dates();
    void day();
    void festival();

    default void timing(){
        System.out.println("Running timing in Calender");
    }
}
