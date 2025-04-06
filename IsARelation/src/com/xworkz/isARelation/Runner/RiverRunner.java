package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.AmazonRiver;
import com.xworkz.isARelation.River;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new River();
        River river1 = new AmazonRiver();
        AmazonRiver amazonRiver = new AmazonRiver();

        System.out.println("=============================");
        river.createValleys();
        river.flow();
        river.generateHydroPower();
        river.provideWater();
        river.supportLife();

        System.out.println("=============================");
        river1.createValleys();
        river1.flow();
        river1.generateHydroPower();
        river1.provideWater();
        river1.supportLife();

        System.out.println("=============================");
        amazonRiver.createValleys();
        amazonRiver.flow();
        amazonRiver.generateHydroPower();
        amazonRiver.provideWater();
        amazonRiver.supportLife();
    }
}
