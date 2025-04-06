package com.xworkz.isARelation;

public class Kangaroo extends Animal {
    public Kangaroo() {
        super();
        System.out.println("no-arg const of Kangaroo");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Kangaroo is eating grass");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Kangaroo is resting on the ground");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Kangaroo is grunting");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Kangaroo is hopping");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Kangaroo is breathing quickly after jumping");
    }
}
