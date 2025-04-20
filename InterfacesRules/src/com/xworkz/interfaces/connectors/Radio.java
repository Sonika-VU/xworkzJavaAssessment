package com.xworkz.interfaces.connectors;

public interface Radio {
    void play();
    void stop();
    void changeStation();

    default void adjustSound(){
        System.out.println("Running adjustSound in Radio");
    }
}
