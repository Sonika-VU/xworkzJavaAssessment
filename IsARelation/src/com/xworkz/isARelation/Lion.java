package com.xworkz.isARelation;

public class Lion extends Animal {
    public Lion() {
        super();
        System.out.println("no-arg const of Lion");
    }

    {
        super.eat();
        System.out.println("Lion is eating meat");

        super.sleep();
        System.out.println("Lion is sleeping under a tree");

        super.makeSound();
        System.out.println("Lion is roaring");

        super.move();
        System.out.println("Lion is running fast");

        super.breathe();
        System.out.println("Lion is breathing heavily");
    }
}
