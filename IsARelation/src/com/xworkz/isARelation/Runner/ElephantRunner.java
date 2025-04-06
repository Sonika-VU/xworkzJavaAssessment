package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Elephant;

public class ElephantRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Elephant();
        Elephant elephant = new Elephant();
        System.out.println("===================");
        animal.eat();
        animal.move();
        animal.breathe();
        animal.makeSound();
        animal.sleep();

        System.out.println("===================");
        animal1.eat();
        animal1.move();
        animal1.breathe();
        animal1.makeSound();
        animal1.sleep();

        System.out.println("===================");
        elephant.eat();
        elephant.move();
        elephant.breathe();
        elephant.makeSound();
        elephant.sleep();
    }
}
