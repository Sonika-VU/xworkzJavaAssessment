package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Animal;
import com.xworkz.isARelation.Giraffe;

public class GiraffeRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Giraffe();
        Giraffe giraffe =new Giraffe();

        System.out.println("======================");
        animal.breathe();
        animal.makeSound();
        animal.move();
        animal.eat();
        animal.sleep();

        System.out.println("======================");
        animal1.breathe();
        animal1.makeSound();
        animal1.move();
        animal1.eat();
        animal1.sleep();

        System.out.println("======================");
        giraffe.breathe();
        giraffe.makeSound();
        giraffe.move();
        giraffe.eat();
        giraffe.sleep();
    }
}
