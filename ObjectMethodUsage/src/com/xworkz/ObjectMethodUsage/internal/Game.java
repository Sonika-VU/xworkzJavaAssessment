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

    @Override
    public int hashCode() {
        return 213112;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Game) {
                System.out.println("Ref instanceOf Game");
                Game game1 = this;
                Game  game2 = (Game) obj;
                if (game1.name == game2.name && game2.isOnline == game1.isOnline) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
