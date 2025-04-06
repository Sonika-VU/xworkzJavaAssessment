package com.xworkz.isARelation;

public class Lavender extends Flower {
    public Lavender() {
        super();
        System.out.println("no-arg const of Lavender");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Lavender is used for decoration and fragrance");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Lavender is rarely used in garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Lavender attracts bees for pollination");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Lavender petals fall when dried");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Lavender tea is a popular herbal drink");
    }
}
