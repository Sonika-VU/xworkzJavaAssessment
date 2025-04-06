package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Hibiscus;

public class HibiscusRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Hibiscus();
        Hibiscus hibiscus = new Hibiscus();

        System.out.println("===========================");
        flower.makeDrinks();
        flower.fell();
        flower.decorate();
        flower.garland();
        flower.provideNectar();

        System.out.println("===========================");
        flower1.makeDrinks();
        flower1.fell();
        flower1.decorate();
        flower1.garland();
        flower1.provideNectar();

        System.out.println("===========================");
        hibiscus.makeDrinks();
        hibiscus.fell();
        hibiscus.decorate();
        hibiscus.garland();
        hibiscus.provideNectar();
    }
}
