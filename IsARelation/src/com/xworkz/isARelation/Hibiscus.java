package com.xworkz.isARelation;

public class Hibiscus extends Flower {
    public Hibiscus() {
        super();
        System.out.println("no-arg const of Hibiscus");
    }

    @Override
    public void decorate() {
//        super.decorate();
        System.out.println("Hibiscus is used for home and temple decorations");
    }

    @Override
    public void garland() {
//        super.garland();
        System.out.println("Hibiscus is sometimes used in floral arrangements");
    }

    @Override
    public void provideNectar() {
//        super.provideNectar();
        System.out.println("Hibiscus attracts butterflies and hummingbirds");
    }

    @Override
    public void fell() {
//        super.fell();
        System.out.println("Hibiscus petals fall quickly after blooming");
    }

    @Override
    public void makeDrinks(){
//        super.makeDrinks();
        System.out.println("Hibiscus tea is a popular herbal drink");
    }
}
