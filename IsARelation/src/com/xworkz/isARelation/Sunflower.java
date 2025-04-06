package com.xworkz.isARelation;

public class Sunflower extends Flower {
    public Sunflower() {
        super();
        System.out.println("no-arg const of Sunflower");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Sunflower is used for home decoration");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Sunflowers are used in bouquets, not garlands");
    }

    @Override
    public void provideNectar(){
//        super.provideNectar();
        System.out.println("Sunflower provides nectar for bees");
    }


    @Override
    public void fell() {
//        super.fell();
        System.out.println("Sunflower petals fall in dry climates");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Sunflower seeds are used in herbal teas");
    }
}
