package com.xworkz.isARelation;

public class Lily extends Flower {
    public Lily() {
        super();
        System.out.println("no-arg const of Lily");
    }

    {
        super.decorate();
        System.out.println("Lily is used in floral decorations");

        super.garland();
        System.out.println("Lily is sometimes used in wedding garlands");

        super.provideNectar();
        System.out.println("Lily attracts bees and butterflies with nectar");

        super.fell();
        System.out.println("Lily petals fall after a few days");

        super.makeDrinks();
        System.out.println("Lily extract is used in herbal medicines");
    }
}
