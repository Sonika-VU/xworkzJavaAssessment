package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Bike;
import com.xworkz.isARelation.MountainBike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike bike1 = new MountainBike();
        MountainBike mountainBike = new MountainBike();

        bike.accelerate();
        bike.brake();
        bike.honk();
        bike.start();
        bike.stop();

        System.out.println("=============================");

        bike1.accelerate();
        bike1.brake();
        bike1.honk();
        bike1.start();
        bike1.stop();

        System.out.println("=============================");

        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.honk();
        mountainBike.start();
        mountainBike.stop();

        System.out.println("=============================");

    }
}
