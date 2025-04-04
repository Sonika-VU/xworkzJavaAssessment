package com.xworkz.isARelation;

public class Hibiscus extends Flower {
    public Hibiscus() {
        super();
        System.out.println("no-arg const of Hibiscus");
    }

    {
        super.decorate();
        System.out.println("Hibiscus is used for home and temple decorations");

        super.garland();
        System.out.println("Hibiscus is sometimes used in floral arrangements");

        super.provideNectar();
        System.out.println("Hibiscus attracts butterflies and hummingbirds");

        super.fell();
        System.out.println("Hibiscus petals fall quickly after blooming");

        super.makeDrinks();
        System.out.println("Hibiscus tea is a popular herbal drink");
    }
}
