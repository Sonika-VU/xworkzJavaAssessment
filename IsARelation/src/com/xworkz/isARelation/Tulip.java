package com.xworkz.isARelation;

public class Tulip extends Flower {
    public Tulip() {
        super();
        System.out.println("no-arg const of Tulip");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Tulips are used for garden decoration");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Tulips are rarely used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Tulips provide nectar for insects");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Tulip petals fall after blooming");
    }
    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Tulip petals can be used for herbal drinks");
    }
}
