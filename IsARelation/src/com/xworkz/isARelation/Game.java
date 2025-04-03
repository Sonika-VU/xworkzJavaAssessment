package com.xworkz.isARelation;

public class Game {

    public Game(){
        System.out.println("no-arg const of Game");
    }

    public void startGame(){
        System.out.println("Running startGame in Game");
    }

    public void playGame(){
        System.out.println("Running playGame in Game");
    }

    public void pauseGame(){
        System.out.println("Running pauseGame in Game");
    }

    public void resumeGame(){
        System.out.println("Running resumeGame in Game");
    }

    public void endGame(){
        System.out.println("Running endGame in Game");
    }
}
