package com.xworkz.isARelation;

public class Orchid extends Flower {
    public Orchid() {
        super();
        System.out.println("no-arg const of Orchid");
    }

    {
        super.decorate();
        System.out.println("Orchids are used for luxury decorations");

        super.garland();
        System.out.println("Orchids are rarely used in garlands");

        super.provideNectar();
        System.out.println("Orchids provide nectar for insects");

        super.fell();
        System.out.println("Orchid petals fall after blooming");

        super.makeDrinks();
        System.out.println("Orchid extracts are used in perfumes and drinks");
    }
}
