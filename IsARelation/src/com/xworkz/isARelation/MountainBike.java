package com.xworkz.isARelation;

public class MountainBike extends Bike {
    public MountainBike() {
        super();
        System.out.println("no-arg const of MountainBike");
    }

    {
        super.start();
        System.out.println("Running start in MountainBike");
    }

    {
        super.stop();
        System.out.println("Running stop in MountainBike");
    }

    {
        super.accelerate();
        System.out.println("Running accelerate in MountainBike");
    }

    {
        super.brake();
        System.out.println("Running brake in MountainBike");
    }

    {
        super.honk();
        System.out.println("Running honk in MountainBike");
    }
}
