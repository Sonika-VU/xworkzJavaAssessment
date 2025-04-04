package com.xworkz.isARelation;

public class Lotus extends Flower {
    public Lotus() {
        super();
        System.out.println("no-arg const of Lotus");
    }

    {
        super.decorate();
        System.out.println("Lotus is used for decoration in temples");

        super.garland();
        System.out.println("Lotus is rarely used in garlands");

        super.provideNectar();
        System.out.println("Lotus provides nectar for bees");

        super.fell();
        System.out.println("Lotus petals fall in water");

        super.makeDrinks();
        System.out.println("Lotus seeds are used in herbal drinks");
    }
}
