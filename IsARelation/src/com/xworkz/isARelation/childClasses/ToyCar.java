package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.ToyVehicle;

public class ToyCar extends ToyVehicle {

    @Override
    public void start() {
        System.out.println("Running start in ToyCar");
    }


}
