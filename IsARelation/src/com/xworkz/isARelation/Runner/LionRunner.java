package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Lion;

public class LionRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Lion();
        Lion lion = new Lion();

        System.out.println("========================");
        animal.sleep();
        animal.makeSound();
        animal.move();
        animal.breathe();
        animal.eat();

        System.out.println("========================");
        animal1.sleep();
        animal1.makeSound();
        animal1.move();
        animal1.breathe();
        animal1.eat();

        System.out.println("========================");
        lion.sleep();
        lion.makeSound();
        lion.move();
        lion.breathe();
        lion.eat();


    }
}
