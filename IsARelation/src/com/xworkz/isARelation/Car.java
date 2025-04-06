package com.xworkz.isARelation;

public class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("no-arg const of Car");
    }

    @Override
    public void start(){
//        super.start();
        System.out.println("Running start in Car");
    }

    @Override
    public void accelerate(){
//        super.accelerate();
        System.out.println("Running accelerate in Car");
    }

    @Override
    public void refuel(){
//        super.refuel();
        System.out.println("Running refuel in Car");
    }

    @Override
    public void horn(){
//        super.horn();
        System.out.println("Running horn in Car");
    }

    @Override
    public void stop(){
//        super.stop();
        System.out.println("Running stop in Car");
    }
}
