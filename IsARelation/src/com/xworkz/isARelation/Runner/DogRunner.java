package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.BeagleDog;
import com.xworkz.isARelation.Dog;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new BeagleDog();
        BeagleDog beagleDog = new BeagleDog();

        System.out.println("==========================");
        dog1.bark();
        dog1.bite();
        dog1.run();
        dog1.goWalk();
        dog1.eatsFood();

        System.out.println("==========================");
        dog2.bark();
        dog2.bite();
        dog2.run();
        dog2.goWalk();
        dog2.eatsFood();

        System.out.println("==========================");
        beagleDog.bark();
        beagleDog.bite();
        beagleDog.run();
        beagleDog.goWalk();
        beagleDog.eatsFood();

    }
}
