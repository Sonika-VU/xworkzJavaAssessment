package com.xworkz.isARelation;

public class MountainBike extends Bike {
    public MountainBike() {
        super();
        System.out.println("no-arg const of MountainBike");
    }

    @Override
    public void start(){
        super.start();
        System.out.println("Running start in MountainBike");
    }

    @Override
    public void stop(){
        super.stop();
        System.out.println("Running stop in MountainBike");
    }

    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("Running accelerate in MountainBike");
    }

    @Override
    public void brake(){
        super.brake();
        System.out.println("Running brake in MountainBike");
    }

    @Override
    public void honk(){
        super.honk();
        System.out.println("Running honk in MountainBike");
    }

    public void gears(){
        System.out.println("Running gears in MountainBike");
    }
}
