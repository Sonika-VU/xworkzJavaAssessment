package com.xworkz.isARelation;

public class Lily extends Flower {
    public Lily() {
        super();
        System.out.println("no-arg const of Lily");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Lily is used in floral decorations");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Lily is sometimes used in wedding garlands");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Lily attracts bees and butterflies with nectar");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Lily petals fall after a few days");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Lily extract is used in herbal medicines");
    }
}
