package com.xworkz.isARelation;

public class Dolphin extends Animal {
    public Dolphin() {
        super();
        System.out.println("no-arg const of Dolphin");
    }

    {
        super.eat();
        System.out.println("Dolphin is eating fish");

        super.sleep();
        System.out.println("Dolphin is sleeping with half its brain active");

        super.makeSound();
        System.out.println("Dolphin is clicking and whistling");

        super.move();
        System.out.println("Dolphin is swimming gracefully");

        super.breathe();
        System.out.println("Dolphin is breathing through its blowhole");
    }
}
