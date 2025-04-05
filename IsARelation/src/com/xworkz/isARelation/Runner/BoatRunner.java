package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Boat;
import com.xworkz.isARelation.Sailboat;

public class BoatRunner {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Boat boat1 = new Sailboat();
        Sailboat sailboat = new Sailboat();

        System.out.println("====================");
        boat.anchor();
        boat.floatOnWater();
        boat.slowDown();
        boat.speedUp();
        boat.steer();

        System.out.println("====================");
        boat1.anchor();
        boat1.floatOnWater();
        boat1.slowDown();
        boat1.speedUp();
        boat1.steer();

        System.out.println("====================");
        sailboat.anchor();
        sailboat.floatOnWater();
        sailboat.slowDown();
        sailboat.speedUp();
        sailboat.steer();
    }
}
