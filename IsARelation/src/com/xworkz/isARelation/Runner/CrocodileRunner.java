package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Crocodile;

public class CrocodileRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Crocodile();
        Crocodile crocodile = new Crocodile();

        System.out.println("======================");
        animal.sleep();
        animal.eat();
        animal.breathe();
        animal.move();
        animal.makeSound();

        System.out.println("======================");
        animal1.sleep();
        animal1.eat();
        animal1.breathe();
        animal1.move();
        animal1.makeSound();

        System.out.println("======================");
        crocodile.sleep();
        crocodile.eat();
        crocodile.breathe();
        crocodile.move();
        crocodile.makeSound();
    }
}
