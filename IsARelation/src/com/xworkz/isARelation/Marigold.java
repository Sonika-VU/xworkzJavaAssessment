package com.xworkz.isARelation;

public class Marigold extends Flower {
    public Marigold() {
        super();
        System.out.println("no-arg const of Marigold");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Marigold is widely used for decoration");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Marigold is commonly used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Marigold attracts bees and butterflies");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Marigold petals fall when dried");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Marigold extracts are used in herbal teas");
    }
}
