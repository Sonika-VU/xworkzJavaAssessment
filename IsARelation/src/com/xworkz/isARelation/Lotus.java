package com.xworkz.isARelation;

public class Lotus extends Flower {
    public Lotus() {
        super();
        System.out.println("no-arg const of Lotus");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Lotus is used for decoration in temples");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Lotus is rarely used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Lotus provides nectar for bees");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Lotus petals fall in water");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Lotus seeds are used in herbal drinks");
    }
}
