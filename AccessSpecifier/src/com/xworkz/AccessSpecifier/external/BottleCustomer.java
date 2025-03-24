package com.xworkz.AccessSpecifier.external;

import com.xworkz.AccessSpecifier.internal.Bottle;

public class BottleCustomer {

    Bottle bottle = new Bottle();

    public void purchase(){
        System.out.println(bottle.company);
        bottle.checkItemAvailability();
    }
}
