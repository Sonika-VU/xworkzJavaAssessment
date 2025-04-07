package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Cabinet;
import com.xworkz.isARelation.Cat;

public class AnimalLover {

    public void provideShelter(Animal animal){
        animal.sleep();
        animal.makeSound();
        animal.move();
        animal.breathe();
        animal.eat();

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.drinkMilk();
        }
    }
}
