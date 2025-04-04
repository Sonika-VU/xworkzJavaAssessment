package com.xworkz.isARelation;

public class Crocodile extends Animal {
    public Crocodile() {
        super();
        System.out.println("no-arg const of Crocodile");
    }

    {
        super.eat();
        System.out.println("Crocodile is eating its prey");

        super.sleep();
        System.out.println("Crocodile is sleeping on the riverbank");

        super.makeSound();
        System.out.println("Crocodile is hissing");

        super.move();
        System.out.println("Crocodile is swimming in water");

        super.breathe();
        System.out.println("Crocodile is breathing through its nostrils above water");
    }
}
