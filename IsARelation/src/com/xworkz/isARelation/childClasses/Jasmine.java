package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Flower;

public class Jasmine extends Flower {
    @Override
    public void dry() {
        System.out.println("Running dry in Jasmine");
    }
}
