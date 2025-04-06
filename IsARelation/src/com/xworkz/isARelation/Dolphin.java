package com.xworkz.isARelation;

public class Dolphin extends Animal {
    public Dolphin() {
        super();
        System.out.println("no-arg const of Dolphin");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Dolphin is eating fish");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Dolphin is sleeping with half its brain active");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Dolphin is clicking and whistling");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Dolphin is swimming gracefully");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Dolphin is breathing through its blowhole");
    }
}
