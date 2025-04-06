package com.xworkz.isARelation;

public class Giraffe extends Animal {
    public Giraffe() {
        super();
        System.out.println("no-arg const of Giraffe");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Giraffe is eating leaves");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Giraffe is sleeping standing up");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Giraffe is making a humming sound");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Giraffe is walking with long strides");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Giraffe is breathing smoothly");
    }
}
