package com.xworkz.ObjectMethodUsage.internal;

public class BoardGame {
    private String gameName;
    private int minPlayers;
    private boolean strategyBased;

    public BoardGame(String gameName, int minPlayers, boolean strategyBased) {
        System.out.println("String, int, boolean-arg const of BoardGame");
        this.gameName = gameName;
        this.minPlayers = minPlayers;
        this.strategyBased = strategyBased;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "gameName='" + gameName + '\'' +
                ", minPlayers=" + minPlayers +
                ", strategyBased=" + strategyBased +
                '}';
    }
}
