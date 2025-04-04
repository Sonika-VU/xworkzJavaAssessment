package com.xworkz.isARelation;

public class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("no-arg const of Cat");
    }

    {
        super.eat();
        System.out.println("Cat is eating fish");

        super.sleep();
        System.out.println("Cat is sleeping on the sofa");

        super.makeSound();
        System.out.println("Cat is meowing");

        super.move();
        System.out.println("Cat is jumping");

        super.breathe();
        System.out.println("Cat is breathing normally");
    }
}
