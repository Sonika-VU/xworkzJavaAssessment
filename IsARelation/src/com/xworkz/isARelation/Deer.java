package com.xworkz.isARelation;

public class Deer extends Animal {
    public Deer() {
        super();
        System.out.println("no-arg const of Deer");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Deer is eating grass");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Deer is sleeping in the woods");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Deer is making a soft bleating sound");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Deer is running gracefully");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Deer is breathing calmly");
    }

    public void takeSkin(){
        System.out.println("Running takeSkin in Deer");
    }
}
