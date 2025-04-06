package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Sunflower;

public class SunflowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Sunflower();
        Sunflower sunflower = new Sunflower();

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
        sunflower.provideNectar();
        sunflower.fell();
        sunflower.garland();
        sunflower.decorate();
        sunflower.makeDrinks();


    }
}
