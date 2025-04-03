package com.xworkz.isARelation;

public class OakTree extends Tree {
    public OakTree() {
        super();
        System.out.println("no-arg const of OakTree");
    }

    {
        super.grow();
        System.out.println("Running grow in OakTree");
    }

    {
        super.provideOxygen();
        System.out.println("Running provideOxygen in OakTree");
    }

    {
        super.absorbWater();
        System.out.println("Running absorbWater in OakTree");
    }

    {
        super.shedLeaves();
        System.out.println("Running shedLeaves in OakTree");
    }

    {
        super.bearFruit();
        System.out.println("Running bearFruit in OakTree");
    }
}
