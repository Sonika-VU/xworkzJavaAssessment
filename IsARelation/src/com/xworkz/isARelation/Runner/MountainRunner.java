package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Everest;
import com.xworkz.isARelation.Mountain;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        Mountain mountain1 = new Everest();
        Everest everest = new Everest();

        System.out.println("========================");
        mountain.affectWeather();
        mountain.attractTourists();
        mountain.containMinerals();
        mountain.riseAboveLand();
        mountain.supportEcosystems();

        System.out.println("========================");
        mountain1.affectWeather();
        mountain1.attractTourists();
        mountain1.containMinerals();
        mountain1.riseAboveLand();
        mountain1.supportEcosystems();

        System.out.println("========================");
        everest.affectWeather();
        everest.attractTourists();
        everest.containMinerals();
        everest.riseAboveLand();
        everest.supportEcosystems();
    }
}
