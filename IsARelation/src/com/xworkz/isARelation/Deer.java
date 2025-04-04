package com.xworkz.isARelation;

public class Deer extends Animal {
    public Deer() {
        super();
        System.out.println("no-arg const of Deer");
    }

    {
        super.eat();
        System.out.println("Deer is eating grass");

        super.sleep();
        System.out.println("Deer is sleeping in the woods");

        super.makeSound();
        System.out.println("Deer is making a soft bleating sound");

        super.move();
        System.out.println("Deer is running gracefully");

        super.breathe();
        System.out.println("Deer is breathing calmly");
    }
}
