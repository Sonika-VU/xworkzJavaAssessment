package com.xworkz.isARelation;

public class Jasmine extends Flower {
    public Jasmine() {
        super();
        System.out.println("no-arg const of Jasmine");
    }

    {
        super.decorate();
        System.out.println("Jasmine is used for decoration and perfumes");

        super.garland();
        System.out.println("Jasmine is commonly used in garlands");

        super.provideNectar();
        System.out.println("Jasmine provides nectar for butterflies");

        super.fell();
        System.out.println("Jasmine petals fall easily");

        super.makeDrinks();
        System.out.println("Jasmine is used in tea and scented drinks");
    }
}
