package com.xworkz.isARelation;

public class Parrot extends Bird{

    public Parrot(){
        super();
        System.out.println("no-arg const of Parrot");
    }

    {
        super.makeSound();
        System.out.println("Running makeSound in Parrot");
    }

    {
        super.drinkWater();
        System.out.println("Running drinkWater in Parrot");
    }

    {
        super.collectGrass();
        System.out.println("Running collectGrass in Parrot");
    }

    {
        super.eatFood();
        System.out.println("Running eatFood in Parrot");
    }

    {
        super.fly();
        System.out.println("Running fly in Parrot");
    }
}
