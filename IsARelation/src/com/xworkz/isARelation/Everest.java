package com.xworkz.isARelation;

public class Everest extends Mountain {
    public Everest() {
        super();
        System.out.println("no-arg const of Everest");
    }

    @Override
    public void riseAboveLand(){
//        super.riseAboveLand();
        System.out.println("Running riseAboveLand in Everest");
    }

    @Override
    public void supportEcosystems(){
//        super.supportEcosystems();
        System.out.println("Running supportEcosystems in Everest");
    }

    @Override
    public void containMinerals(){
//        super.containMinerals();
        System.out.println("Running containMinerals in Everest");
    }

    @Override
    public void affectWeather(){
//        super.affectWeather();
        System.out.println("Running affectWeather in Everest");
    }

    @Override
    public void attractTourists(){
        super.attractTourists();
        System.out.println("Running attractTourists in Everest");
    }

    public void getAir(){
        System.out.println("Running getAir in Everest");
    }
}
