package com.xworkz.interfaces.connectors;

public interface GameController {
    void startGame();
    void pauseGame();
    void resumeGame();

    default void adjustTiming(){

    }
}
