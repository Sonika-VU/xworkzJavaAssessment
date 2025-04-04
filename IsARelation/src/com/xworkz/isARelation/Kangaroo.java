package com.xworkz.isARelation;

public class Kangaroo extends Animal {
    public Kangaroo() {
        super();
        System.out.println("no-arg const of Kangaroo");
    }

    {
        super.eat();
        System.out.println("Kangaroo is eating grass");

        super.sleep();
        System.out.println("Kangaroo is resting on the ground");

        super.makeSound();
        System.out.println("Kangaroo is grunting");

        super.move();
        System.out.println("Kangaroo is hopping");

        super.breathe();
        System.out.println("Kangaroo is breathing quickly after jumping");
    }
}
