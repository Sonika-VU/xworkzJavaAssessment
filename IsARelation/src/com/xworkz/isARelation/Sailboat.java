package com.xworkz.isARelation;

public class Sailboat extends Boat {
    public Sailboat() {
        super();
        System.out.println("no-arg const of Sailboat");
    }

    @Override
    public void floatOnWater(){
//        super.floatOnWater();
        System.out.println("Running floatOnWater in Sailboat");
    }

    @Override
    public void steer(){
//        super.steer();
        System.out.println("Running steer in Sailboat");
    }

    @Override
    public void anchor(){
//        super.anchor();
        System.out.println("Running anchor in Sailboat");
    }

    @Override
    public void speedUp(){
//        super.speedUp();
        System.out.println("Running speedUp in Sailboat");
    }

    @Override
    public void slowDown(){
//        super.slowDown();
        System.out.println("Running slowDown in Sailboat");
    }

    public void allowPeople(){
        System.out.println("Running allowPeople in SailBoat");
    }
}
