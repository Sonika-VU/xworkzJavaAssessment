package com.xworkz.isARelation;

public class Lion extends Animal {
    public Lion() {
        super();
        System.out.println("no-arg const of Lion");
    }

    @Override
    public void  eat() {
//        super.eat();
        System.out.println("Lion is eating meat");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Lion is sleeping under a tree");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Lion is roaring");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Lion is running fast");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Lion is breathing heavily");
    }
}
