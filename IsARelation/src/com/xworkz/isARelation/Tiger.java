package com.xworkz.isARelation;

public class Tiger extends Mammal {
    public Tiger() {
        super();
        System.out.println("no-arg const of Tiger");
    }

    {
        super.walk();
        System.out.println("Running walk in Tiger");
    }

    {
        super.giveBirth();
        System.out.println("Running giveBirth in Tiger");
    }

    {
        super.drinkMilk();
        System.out.println("Running drinkMilk in Tiger");
    }

    {
        super.communicate();
        System.out.println("Running communicate in Tiger");
    }

    {
        super.hunt();
        System.out.println("Running hunt in Tiger");
    }
}
