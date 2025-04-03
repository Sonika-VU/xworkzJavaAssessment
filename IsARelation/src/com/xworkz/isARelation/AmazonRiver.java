package com.xworkz.isARelation;

public class AmazonRiver extends River {
    public AmazonRiver() {
        super();
        System.out.println("no-arg const of AmazonRiver");
    }

    {
        super.flow();
        System.out.println("Running flow in AmazonRiver");
    }

    {
        super.provideWater();
        System.out.println("Running provideWater in AmazonRiver");
    }

    {
        super.supportLife();
        System.out.println("Running supportLife in AmazonRiver");
    }

    {
        super.createValleys();
        System.out.println("Running createValleys in AmazonRiver");
    }

    {
        super.generateHydroPower();
        System.out.println("Running generateHydroPower in AmazonRiver");
    }
}
