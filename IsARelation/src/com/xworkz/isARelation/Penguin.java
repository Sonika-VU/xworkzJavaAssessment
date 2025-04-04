package com.xworkz.isARelation;

public class Penguin extends Animal {
    public Penguin() {
        super();
        System.out.println("no-arg const of Penguin");
    }

    {
        super.eat();
        System.out.println("Penguin is eating fish");

        super.sleep();
        System.out.println("Penguin is sleeping while standing");

        super.makeSound();
        System.out.println("Penguin is making a honking sound");

        super.move();
        System.out.println("Penguin is waddling on ice");

        super.breathe();
        System.out.println("Penguin is breathing in cold air");
    }
}
