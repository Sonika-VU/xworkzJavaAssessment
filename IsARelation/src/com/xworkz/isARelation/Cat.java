package com.xworkz.isARelation;

public class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("no-arg const of Cat");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Cat is eating fish");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Cat is sleeping on the sofa");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Cat is meowing");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Cat is jumping");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Cat is breathing normally");
    }

    public void drinkMilk(){
        System.out.println("Running drinkMilk from Cat");
    }
}
