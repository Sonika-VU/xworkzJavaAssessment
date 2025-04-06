package com.xworkz.isARelation;

public class Penguin extends Animal {
    public Penguin() {
        super();
        System.out.println("no-arg const of Penguin");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Penguin is eating fish");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Penguin is sleeping while standing");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Penguin is making a honking sound");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Penguin is waddling on ice");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Penguin is breathing in cold air");
    }
}
