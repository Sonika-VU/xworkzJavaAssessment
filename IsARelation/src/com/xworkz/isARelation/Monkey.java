package com.xworkz.isARelation;

public class Monkey extends Animal {
    public Monkey() {
        super();
        System.out.println("no-arg const of Monkey");
    }

    {
        super.eat();
        System.out.println("Monkey is eating bananas");

        super.sleep();
        System.out.println("Monkey is sleeping on a tree");

        super.makeSound();
        System.out.println("Monkey is chattering");

        super.move();
        System.out.println("Monkey is swinging on branches");

        super.breathe();
        System.out.println("Monkey is breathing actively");
    }
}
