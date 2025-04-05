package com.xworkz.isARelation;

public class Parrot extends Bird{

    public Parrot(){
        super();
        System.out.println("no-arg const of Parrot");
    }

    @Override
    public void makeSound(){
//        super.makeSound();
        System.out.println("Running makeSound in Parrot");
    }

    @Override
    public void drinkWater(){
//        super.drinkWater();
        System.out.println("Running drinkWater in Parrot");
    }

    @Override
    public void collectGrass(){
//        super.collectGrass();
        System.out.println("Running collectGrass in Parrot");
    }

    @Override
    public void eatFood(){
//        super.eatFood();
        System.out.println("Running eatFood in Parrot");
    }

    @Override
    public void fly(){
//        super.fly();
        System.out.println("Running fly in Parrot");
    }
}
