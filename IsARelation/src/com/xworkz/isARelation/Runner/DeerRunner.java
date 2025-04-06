package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Deer;

public class DeerRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Deer();
        Deer deer=  new Deer();

        System.out.println("========================");
        animal.makeSound();
        animal.eat();
        animal.breathe();
        animal.move();
        animal.sleep();

        System.out.println("========================");
        animal1.makeSound();
        animal1.eat();
        animal1.breathe();
        animal1.move();
        animal1.sleep();

        System.out.println("========================");
        deer.makeSound();
        deer.eat();
        animal.breathe();
        deer.move();
        deer.sleep();
    }
}
