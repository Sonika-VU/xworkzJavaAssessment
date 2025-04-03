package com.xworkz.isARelation;

public class Butterfly extends Insect {
    public Butterfly() {
        super();
        System.out.println("no-arg const of Butterfly");
    }

    {
        super.crawl();
        System.out.println("Running crawl in Butterfly");
    }

    {
        super.fly();
        System.out.println("Running fly in Butterfly");
    }

    {
        super.layEggs();
        System.out.println("Running layEggs in Butterfly");
    }

    {
        super.senseSurroundings();
        System.out.println("Running senseSurroundings in Butterfly");
    }

    {
        super.feed();
        System.out.println("Running feed in Butterfly");
    }
}
