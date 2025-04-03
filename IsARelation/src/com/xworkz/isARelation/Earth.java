package com.xworkz.isARelation;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("no-arg const of Earth");
    }

    {
        super.rotate();
        System.out.println("Running rotate in Earth");
    }

    {
        super.revolve();
        System.out.println("Running revolve in Earth");
    }

    {
        super.supportLife();
        System.out.println("Running supportLife in Earth");
    }

    {
        super.hasAtmosphere();
        System.out.println("Running hasAtmosphere in Earth");
    }

    {
        super.hasGravity();
        System.out.println("Running hasGravity in Earth");
    }
}
