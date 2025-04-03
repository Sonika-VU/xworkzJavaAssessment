package com.xworkz.isARelation;

public class Helicopter extends Aircraft {
    public Helicopter() {
        super();
        System.out.println("no-arg const of Helicopter");
    }

    {
        super.takeOff();
        System.out.println("Running takeOff in Helicopter");
    }

    {
        super.land();
        System.out.println("Running land in Helicopter");
    }

    {
        super.refuel();
        System.out.println("Running refuel in Helicopter");
    }

    {
        super.navigate();
        System.out.println("Running navigate in Helicopter");
    }

    {
        super.maintainAltitude();
        System.out.println("Running maintainAltitude in Helicopter");
    }
}
