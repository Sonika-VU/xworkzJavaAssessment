package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Fish;
import com.xworkz.isARelation.Shark;

public class OceanMaintainer {

    public void feed(Fish fish){
        fish.hide();
        fish.breatheUnderwater();
        fish.findFood();
        fish.swim();
        fish.layEggs();

        if(fish instanceof Shark){
            Shark shark = (Shark) fish;
            shark.eatFish();
        }
    }
}
