package com.xworkz.isARelation;

public class Butterfly extends Insect {
    public Butterfly() {
        super();
        System.out.println("no-arg const of Butterfly");
    }

    @Override
    public void crawl(){
//        super.crawl();
        System.out.println("Running crawl in Butterfly");
    }

    @Override
    public void fly(){
//        super.fly();
        System.out.println("Running fly in Butterfly");
    }

    @Override
    public void layEggs(){
//        super.layEggs();
        System.out.println("Running layEggs in Butterfly");
    }

    @Override
    public void senseSurroundings(){
//        super.senseSurroundings();
        System.out.println("Running senseSurroundings in Butterfly");
    }

    @Override
    public void feed(){
//        super.feed();
        System.out.println("Running feed in Butterfly");
    }

    public void getNectar(){
        System.out.println("Running getNectar in Butterfly");
    }
}
