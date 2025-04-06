package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Daffodil;
import com.xworkz.isARelation.Flower;

public class DaffodilRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower1 = new Daffodil();
        Daffodil daffodil = new Daffodil();

        System.out.println("===================");
        flower.decorate();
        flower.fell();
        flower.garland();
        flower.makeDrinks();
        flower.provideNectar();

        System.out.println("===================");
        flower1.decorate();
        flower1.fell();
        flower1.garland();
        flower1.makeDrinks();
        flower1.provideNectar();

        System.out.println("===================");
        daffodil.decorate();
        daffodil.fell();
        daffodil.garland();
        daffodil.makeDrinks();
        daffodil.provideNectar();
    }
}
