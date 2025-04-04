package com.xworkz.isARelation;

public class Lavender extends Flower {
    public Lavender() {
        super();
        System.out.println("no-arg const of Lavender");
    }

    {
        super.decorate();
        System.out.println("Lavender is used for decoration and fragrance");

        super.garland();
        System.out.println("Lavender is rarely used in garlands");

        super.provideNectar();
        System.out.println("Lavender attracts bees for pollination");

        super.fell();
        System.out.println("Lavender petals fall when dried");

        super.makeDrinks();
        System.out.println("Lavender tea is a popular herbal drink");
    }
}
