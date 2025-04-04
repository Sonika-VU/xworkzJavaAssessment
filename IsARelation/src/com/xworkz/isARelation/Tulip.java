package com.xworkz.isARelation;

public class Tulip extends Flower {
    public Tulip() {
        super();
        System.out.println("no-arg const of Tulip");
    }

    {
        super.decorate();
        System.out.println("Tulips are used for garden decoration");

        super.garland();
        System.out.println("Tulips are rarely used in garlands");

        super.provideNectar();
        System.out.println("Tulips provide nectar for insects");

        super.fell();
        System.out.println("Tulip petals fall after blooming");

        super.makeDrinks();
        System.out.println("Tulip petals can be used for herbal drinks");
    }
}
