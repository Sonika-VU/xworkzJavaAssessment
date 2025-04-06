package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Fish;
import com.xworkz.isARelation.Shark;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Fish fish1 = new Shark();
        Shark shark = new Shark();

        System.out.println("========================");
        fish.hide();
        fish.breatheUnderwater();
        fish.findFood();
        fish.swim();
        fish.layEggs();

        System.out.println("========================");
        fish1.hide();
        fish1.breatheUnderwater();
        fish1.findFood();
        fish1.swim();
        fish1.layEggs();

        System.out.println("========================");
        shark.hide();
        shark.breatheUnderwater();
        shark.findFood();
        shark.swim();
        shark.layEggs();
    }
}
