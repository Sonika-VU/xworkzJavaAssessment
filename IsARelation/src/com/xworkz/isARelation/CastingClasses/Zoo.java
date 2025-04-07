package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Deer;

public class Zoo {

    public void getAnimals(Animal animal ){
        animal.makeSound();
        animal.eat();
        animal.breathe();
        animal.move();
        animal.sleep();

        if(animal instanceof Deer){
            Deer deer = (Deer) animal;
            deer.takeSkin();
        }
    }
}
