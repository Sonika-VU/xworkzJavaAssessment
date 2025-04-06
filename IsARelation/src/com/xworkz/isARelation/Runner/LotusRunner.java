package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Lotus;

public class LotusRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Lotus();
        Lotus lotus = new Lotus();

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
        lotus.provideNectar();
        lotus.fell();
        lotus.garland();
        lotus.decorate();
        lotus.makeDrinks();


    }
}
