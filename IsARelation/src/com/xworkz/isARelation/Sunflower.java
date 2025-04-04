package com.xworkz.isARelation;

public class Sunflower extends Flower {
    public Sunflower() {
        super();
        System.out.println("no-arg const of Sunflower");
    }

    {
        super.decorate();
        System.out.println("Sunflower is used for home decoration");

        super.garland();
        System.out.println("Sunflowers are used in bouquets, not garlands");

        super.provideNectar();
        System.out.println("Sunflower provides nectar for bees");

        super.fell();
        System.out.println("Sunflower petals fall in dry climates");

        super.makeDrinks();
        System.out.println("Sunflower seeds are used in herbal teas");
    }
}
