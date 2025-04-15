package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Milton;

public class Bottle extends Milton {
    @Override
    public void manufacture() {
        System.out.println("Running manufacture in Bottle");

    }
}
