package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Flower;
import com.xworkz.isARelation.Jasmine;

public class JasmineRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Jasmine();
        Jasmine jasmine = new Jasmine();

        System.out.println("=========================");
        flower.provideNectar();
        flower.fell();
        flower.garland();
        flower.makeDrinks();
        flower.decorate();

        System.out.println("=========================");
        flower1.provideNectar();
        flower1.fell();
        flower1.garland();
        flower1.makeDrinks();
        flower1.decorate();

        System.out.println("=========================");
        jasmine.provideNectar();
        jasmine.fell();
        jasmine.garland();
        jasmine.makeDrinks();
        jasmine.decorate();
    }
}
