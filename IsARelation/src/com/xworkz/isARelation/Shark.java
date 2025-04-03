package com.xworkz.isARelation;

public class Shark extends Fish {
    public Shark() {
        super();
        System.out.println("no-arg const of Shark");
    }

    {
        super.swim();
        System.out.println("Running swim in Shark");
    }

    {
        super.breatheUnderwater();
        System.out.println("Running breatheUnderwater in Shark");
    }

    {
        super.layEggs();
        System.out.println("Running layEggs in Shark");
    }

    {
        super.findFood();
        System.out.println("Running findFood in Shark");
    }

    {
        super.hide();
        System.out.println("Running hide in Shark");
    }
}
