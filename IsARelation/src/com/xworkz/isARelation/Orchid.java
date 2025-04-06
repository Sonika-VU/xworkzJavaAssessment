package com.xworkz.isARelation;

public class Orchid extends Flower {
    public Orchid() {
        super();
        System.out.println("no-arg const of Orchid");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Orchids are used for luxury decorations");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Orchids are rarely used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Orchids provide nectar for insects");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Orchid petals fall after blooming");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Orchid extracts are used in perfumes and drinks");
    }
}
