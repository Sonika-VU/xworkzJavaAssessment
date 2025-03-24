package com.xworkz.AccessSpecifier.internal;

public class BottleManufacturer {

    Bottle bottle = new Bottle();

    void manufactureBottle(){
        System.out.println(bottle.company);
        System.out.println(bottle.price);
        bottle.checkItemAvailability();
        bottle.fillIt();
    }
}
