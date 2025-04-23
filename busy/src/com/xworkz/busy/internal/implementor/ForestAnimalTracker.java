package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.WildLifeTracker;

public class ForestAnimalTracker implements WildLifeTracker {

    public ForestAnimalTracker(){
        System.out.println("no-arg const of ForestAnimalTracker");
    }
    @Override
    public void trackAnimal() {
        System.out.println("Running trackAnimal in ForestAnimalTracker");
    }
}
