package com.xworkz.isARelation;

public class Marigold extends Flower {
    public Marigold() {
        super();
        System.out.println("no-arg const of Marigold");
    }

    {
        super.decorate();
        System.out.println("Marigold is widely used for decoration");

        super.garland();
        System.out.println("Marigold is commonly used in garlands");

        super.provideNectar();
        System.out.println("Marigold attracts bees and butterflies");

        super.fell();
        System.out.println("Marigold petals fall when dried");

        super.makeDrinks();
        System.out.println("Marigold extracts are used in herbal teas");
    }
}
