package com.xworkz.isARelation;

public class Monkey extends Animal {
    public Monkey() {
        super();
        System.out.println("no-arg const of Monkey");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Monkey is eating bananas");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Monkey is sleeping on a tree");

    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Monkey is chattering");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Monkey is swinging on branches");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Monkey is breathing actively");
    }
}
