package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Marigold;

public class MarigoldRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Marigold();
        Marigold marigold = new Marigold();

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
        marigold.provideNectar();
        marigold.fell();
        marigold.garland();
        marigold.decorate();
        marigold.makeDrinks();
    }
}
