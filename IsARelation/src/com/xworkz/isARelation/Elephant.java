package com.xworkz.isARelation;

public class Elephant extends Animal {
    public Elephant() {
        super();
        System.out.println("no-arg const of Elephant");
    }

    @Override
    public  void eat() {
//        super.eat();
        System.out.println("Elephant is eating bananas");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Elephant is sleeping while standing");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Elephant is trumpeting");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Elephant is walking slowly");
    }

    @Override
    public void breathe(){
//        super.breathe();
        System.out.println("Elephant is taking deep breaths");
    }
}
