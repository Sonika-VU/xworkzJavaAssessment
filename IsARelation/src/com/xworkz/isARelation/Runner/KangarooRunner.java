package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Kangaroo;

public class KangarooRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Kangaroo();
        Kangaroo kangaroo  = new Kangaroo();

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
        kangaroo.sleep();
        kangaroo.makeSound();
        kangaroo.move();
        kangaroo.breathe();
        kangaroo.eat();
    }
}
