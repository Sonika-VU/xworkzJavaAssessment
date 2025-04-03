package com.xworkz.isARelation;

public class Mango extends Fruit {
    public Mango() {
        super();
        System.out.println("no-arg const of Mango");
    }

    {
        super.color();
        System.out.println("Running color in Mango");
    }

    {
        super.taste();
        System.out.println("Running taste in Mango");
    }

    {
        super.vitamins();
        System.out.println("Running vitamins in Mango");
    }

    {
        super.grow();
        System.out.println("Running grow in Mango");
    }

    {
        super.ripen();
        System.out.println("Running ripen in Mango");
    }
}
