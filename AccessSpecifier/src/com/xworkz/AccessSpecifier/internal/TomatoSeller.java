package com.xworkz.AccessSpecifier.internal;

public class TomatoSeller {

    Tomato tomato = new Tomato();

    public void sell(){
        System.out.println(tomato.isRipen);
        System.out.println(tomato.price);
        tomato.setArea();
        tomato.waterPlants();
    }
}
