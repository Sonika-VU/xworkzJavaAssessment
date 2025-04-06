package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Tulip;

public class TulipRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Tulip();
        Tulip tulip = new Tulip();

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
        tulip.provideNectar();
        tulip.fell();
        tulip.garland();
        tulip.decorate();
        tulip.makeDrinks();

    }
}
