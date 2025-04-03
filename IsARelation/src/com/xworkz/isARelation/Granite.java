package com.xworkz.isARelation;

public class Granite extends Rock {
    public Granite() {
        super();
        System.out.println("no-arg const of Granite");
    }

    {
        super.formNaturally();
        System.out.println("Running formNaturally in Granite");
    }

    {
        super.provideMinerals();
        System.out.println("Running provideMinerals in Granite");
    }

    {
        super.withstandWeather();
        System.out.println("Running withstandWeather in Granite");
    }

    {
        super.supportStructures();
        System.out.println("Running supportStructures in Granite");
    }

    {
        super.appearInDifferentShapes();
        System.out.println("Running appearInDifferentShapes in Granite");
    }
}
