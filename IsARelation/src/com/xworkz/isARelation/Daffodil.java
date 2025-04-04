package com.xworkz.isARelation;

public class Daffodil extends Flower {
    public Daffodil() {
        super();
        System.out.println("no-arg const of Daffodil");
    }

    {
        super.decorate();
        System.out.println("Daffodils are popular in garden decoration");

        super.garland();
        System.out.println("Daffodils are not commonly used in garlands");

        super.provideNectar();
        System.out.println("Daffodils provide nectar for early spring insects");

        super.fell();
        System.out.println("Daffodil petals fall when they dry");

        super.makeDrinks();
        System.out.println("Daffodils are used in herbal medicine, but are toxic if ingested");
    }
}
