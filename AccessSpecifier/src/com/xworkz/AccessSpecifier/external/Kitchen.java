package com.xworkz.AccessSpecifier.external;

import com.xworkz.AccessSpecifier.internal.Tomato;

public class Kitchen {
    Tomato tomato = new Tomato();

    public void useTomato(){
        System.out.println(tomato.isRipen);
        tomato.waterPlants();
    }
}
