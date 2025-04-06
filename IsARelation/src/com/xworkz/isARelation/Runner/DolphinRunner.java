package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Dolphin;

public class DolphinRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dolphin();
        Dolphin dolphin = new Dolphin();

        System.out.println("===========================");
        animal.sleep();
        animal.move();
        animal.makeSound();
        animal.breathe();
        animal.eat();

        System.out.println("===========================");
        animal1.sleep();
        animal1.move();
        animal1.makeSound();
        animal1.breathe();
        animal1.eat();

        System.out.println("===========================");
        dolphin.sleep();
        dolphin.move();
        dolphin.makeSound();
        dolphin.breathe();
        dolphin.eat();
    }
}
