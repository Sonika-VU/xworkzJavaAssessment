package com.xworkz.isARelation;

public class Daffodil extends Flower {
    public Daffodil() {
        super();
        System.out.println("no-arg const of Daffodil");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Daffodils are popular in garden decoration");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Daffodils are not commonly used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Daffodils provide nectar for early spring insects");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Daffodil petals fall when they dry");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Daffodils are used in herbal medicine, but are toxic if ingested");
    }
}
