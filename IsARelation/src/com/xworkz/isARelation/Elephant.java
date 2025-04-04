package com.xworkz.isARelation;

public class Elephant extends Animal {
    public Elephant() {
        super();
        System.out.println("no-arg const of Elephant");
    }

    {
        super.eat();
        System.out.println("Elephant is eating bananas");

        super.sleep();
        System.out.println("Elephant is sleeping while standing");

        super.makeSound();
        System.out.println("Elephant is trumpeting");

        super.move();
        System.out.println("Elephant is walking slowly");

        super.breathe();
        System.out.println("Elephant is taking deep breaths");
    }
}
