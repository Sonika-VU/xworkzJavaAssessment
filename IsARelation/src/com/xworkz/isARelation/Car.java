package com.xworkz.isARelation;

public class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("no-arg const of Car");
    }

    {
        super.start();
        System.out.println("Running start in Car");
    }

    {
        super.accelerate();
        System.out.println("Running accelerate in Car");
    }

    {
        super.refuel();
        System.out.println("Running refuel in Car");
    }

    {
        super.horn();
        System.out.println("Running horn in Car");
    }

    {
        super.stop();
        System.out.println("Running stop in Car");
    }
}
