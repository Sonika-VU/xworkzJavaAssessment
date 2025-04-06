package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Orchid;

public class OrchidRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Orchid();
        Orchid orchid = new Orchid();

        System.out.println("=====================");
        flower.provideNectar();
        flower.fell();
        flower.garland();
        flower.decorate();
        flower.makeDrinks();

        System.out.println("=====================");
        flower1.provideNectar();
        flower1.fell();
        flower1.garland();
        flower1.decorate();
        flower1.makeDrinks();

        System.out.println("=====================");
        orchid.provideNectar();
        orchid.fell();
        orchid.garland();
        orchid.decorate();
        orchid.makeDrinks();

    }
}
