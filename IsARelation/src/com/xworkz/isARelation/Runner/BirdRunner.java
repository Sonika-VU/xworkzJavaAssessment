package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Bird;
import com.xworkz.isARelation.Parrot;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird bird1 = new Parrot();
        Parrot parrot  = new Parrot();

        System.out.println("===========================");
        bird.collectGrass();
        bird.drinkWater();
        bird.eatFood();
        bird.fly();
        bird.makeSound();

        System.out.println("===========================");
        bird1.collectGrass();
        bird1.drinkWater();
        bird1.eatFood();
        bird1.fly();
        bird1.makeSound();

        System.out.println("===========================");
        parrot.collectGrass();
        parrot.drinkWater();
        parrot.eatFood();
        parrot.fly();
        parrot.makeSound();
    }
}
