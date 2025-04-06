package com.xworkz.isARelation;

public class Crocodile extends Animal {
    public Crocodile() {
        super();
        System.out.println("no-arg const of Crocodile");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Crocodile is eating its prey");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Crocodile is sleeping on the riverbank");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Crocodile is hissing");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Crocodile is swimming in water");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Crocodile is breathing through its nostrils above water");
    }
}
