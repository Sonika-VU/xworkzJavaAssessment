package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Balloon;
import com.xworkz.isARelation.Factory;

public class BalloonSeller {

    public void sell(Factory factory){
        factory.selectItem();
        factory.getEmployee();
        factory.manufacture();
        factory.produceProduct();
        factory.setEquipments();

        if(factory instanceof Balloon){
            Balloon balloon = (Balloon)factory;
            balloon.fillAir();
        }
    }
}
