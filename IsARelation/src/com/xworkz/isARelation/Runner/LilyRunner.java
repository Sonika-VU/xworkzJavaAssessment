package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Lily;

public class LilyRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Lily();
        Lily lily = new Lily();

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
        lily.provideNectar();
        lily.fell();
        lily.garland();
        lily.decorate();
        lily.makeDrinks();

    }
}
