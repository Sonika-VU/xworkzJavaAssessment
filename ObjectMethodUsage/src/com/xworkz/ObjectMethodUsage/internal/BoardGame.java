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

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof BoardGame){
                System.out.println("Ref instanceOf Antique");
                BoardGame boardGame1 = this;
                BoardGame boardGame2 = (BoardGame) obj;
                if(boardGame1.gameName == boardGame2.gameName ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
