package com.xworkz.isARelation;

public class Jasmine extends Flower {
    public Jasmine() {
        super();
        System.out.println("no-arg const of Jasmine");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Jasmine is used for decoration and perfumes");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Jasmine is commonly used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Jasmine provides nectar for butterflies");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Jasmine petals fall easily");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Jasmine is used in tea and scented drinks");
    }
}
