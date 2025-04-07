package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Bed;
import com.xworkz.isARelation.Furniture;

public class BedPatient {

    public void takeRest(Furniture furniture){
        furniture.move();
        furniture.assemble();
        furniture.paint();
        furniture.clean();
        furniture.disassemble();

        if(furniture instanceof Bed){
            Bed bed = (Bed) furniture;
            bed.sleep();
        }
    }
}
