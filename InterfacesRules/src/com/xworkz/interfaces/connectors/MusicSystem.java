package com.xworkz.interfaces.connectors;

public interface MusicSystem {

    void playMusic();
    void stopMusic();
    void shuffleSongs();

    default void adjustSound(){
        System.out.println("Running adjustSound in MusicSystem");
    }
}
