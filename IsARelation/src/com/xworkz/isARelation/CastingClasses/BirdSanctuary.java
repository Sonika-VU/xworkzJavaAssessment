package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Bird;
import com.xworkz.isARelation.Parrot;

public class BirdSanctuary {

    public void shelterBirds(Bird bird){
        bird.collectGrass();
        bird.fly();
        bird.drinkWater();
        bird.makeSound();
        bird.eatFood();

        if(bird instanceof Parrot){
            Parrot parrot = (Parrot) bird;
            parrot.pickCard();
        }
    }
}
