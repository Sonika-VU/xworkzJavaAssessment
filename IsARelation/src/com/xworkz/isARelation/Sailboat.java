package com.xworkz.isARelation;

public class Sailboat extends Boat {
    public Sailboat() {
        super();
        System.out.println("no-arg const of Sailboat");
    }

    {
        super.floatOnWater();
        System.out.println("Running floatOnWater in Sailboat");
    }

    {
        super.steer();
        System.out.println("Running steer in Sailboat");
    }

    {
        super.anchor();
        System.out.println("Running anchor in Sailboat");
    }

    {
        super.speedUp();
        System.out.println("Running speedUp in Sailboat");
    }

    {
        super.slowDown();
        System.out.println("Running slowDown in Sailboat");
    }
}
