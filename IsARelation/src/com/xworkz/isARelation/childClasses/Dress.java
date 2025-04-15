package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Tailor;

public class Dress extends Tailor {
    @Override
    public void stitch() {
        System.out.println("Running stitch in Tailor");
    }
}
