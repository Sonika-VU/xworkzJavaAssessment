package com.xworkz.isARelation;

public class Giraffe extends Animal {
    public Giraffe() {
        super();
        System.out.println("no-arg const of Giraffe");
    }

    {
        super.eat();
        System.out.println("Giraffe is eating leaves");

        super.sleep();
        System.out.println("Giraffe is sleeping standing up");

        super.makeSound();
        System.out.println("Giraffe is making a humming sound");

        super.move();
        System.out.println("Giraffe is walking with long strides");

        super.breathe();
        System.out.println("Giraffe is breathing smoothly");
    }
}
