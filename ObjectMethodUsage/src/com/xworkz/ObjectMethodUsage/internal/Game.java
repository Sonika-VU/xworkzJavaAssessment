package com.xworkz.ObjectMethodUsage.internal;

public class Game {
    private String name;
    private int players;
    private boolean isOnline;

    public Game(String name, int players, boolean isOnline) {
        System.out.println("String, int, boolean-arg const of Game");
        this.name = name;
        this.players = players;
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", isOnline=" + isOnline +
                '}';
    }
}
