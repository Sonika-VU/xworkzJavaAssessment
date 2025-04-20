package com.xworkz.interfaces.connectors;

public interface SmartSpeaker {
    void playSong();
    void stopSong();
    void tellTime();

    default void charge(){
        System.out.println("Running charge in SmartSpeaker");
    }
}
