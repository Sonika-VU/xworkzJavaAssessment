package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Furniture;

public class Chair  extends Furniture {

    @Override
    public void assemble() {
        System.out.println("Running assemble in Chair");
    }
}
