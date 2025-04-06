package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Rose();
        Rose rose = new Rose();

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
        rose.provideNectar();
        rose.fell();
        rose.garland();
        rose.decorate();
        rose.makeDrinks();
    }
}
