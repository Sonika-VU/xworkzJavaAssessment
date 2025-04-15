package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Lens;

public class ConcaveLens extends Lens {
    @Override
    public void passLight() {
        System.out.println("Running passLight in ConcaveLens");
    }
}
