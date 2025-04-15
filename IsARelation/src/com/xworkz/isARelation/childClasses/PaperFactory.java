package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Factory;

public class PaperFactory extends Factory {

    @Override
    public void manufacture() {
        System.out.println("Running manufacture in PaperFactory");
    }
}
