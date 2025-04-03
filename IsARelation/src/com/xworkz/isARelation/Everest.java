package com.xworkz.isARelation;

public class Everest extends Mountain {
    public Everest() {
        super();
        System.out.println("no-arg const of Everest");
    }

    {
        super.riseAboveLand();
        System.out.println("Running riseAboveLand in Everest");
    }

    {
        super.supportEcosystems();
        System.out.println("Running supportEcosystems in Everest");
    }

    {
        super.containMinerals();
        System.out.println("Running containMinerals in Everest");
    }

    {
        super.affectWeather();
        System.out.println("Running affectWeather in Everest");
    }

    {
        super.attractTourists();
        System.out.println("Running attractTourists in Everest");
    }
}
