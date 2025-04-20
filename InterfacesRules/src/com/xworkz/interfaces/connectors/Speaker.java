package com.xworkz.interfaces.connectors;

public interface Speaker {

    void playSound();
    void increaseVolume();
    void decreaseVolume();

    default void connect(){
        System.out.println("Running connect in Speaker");
    }
}
