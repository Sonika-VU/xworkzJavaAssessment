package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Game;

public class VideoGame extends Game {
    public VideoGame(){
        super();
        System.out.println("no-arg const of VideoGame");
    }

    {
        super.startGame();
        System.out.println("Running startGame in VideoGame");
    }

    {
        super.playGame();
        System.out.println("Running playGame in VideoGame");
    }

    {
        super.pauseGame();
        System.out.println("Running pauseGame in VideoGame");
    }

    {
        super.resumeGame();
        System.out.println("Running resumeGame in VideoGame");
    }

    {
        super.endGame();
        System.out.println("Running endGame in VideoGame");
    }
}
