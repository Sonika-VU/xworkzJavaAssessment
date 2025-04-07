package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.BeagleDog;
import com.xworkz.isARelation.Dog;

public class DogCareTaker {

    public void takeCare(Dog dog){
        dog.bark();
        dog.bite();
        dog.run();
        dog.goWalk();
        dog.eatsFood();

        if(dog instanceof BeagleDog){
            BeagleDog beagleDog = (BeagleDog) dog;
            beagleDog.jump();
        }
    }
}
