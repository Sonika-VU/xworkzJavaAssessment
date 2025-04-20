package com.xworkz.interfaces.connectors;

public interface MusicPlayer {
    void play();
    void pause();
    void stop();

    default void charge(){

    }
}
