package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.AmazonRiver;
import com.xworkz.isARelation.River;

public class WaterBody {

    public void store(River river){
        river.createValleys();
        river.flow();
        river.generateHydroPower();
        river.provideWater();
        river.supportLife();

        if(river instanceof AmazonRiver){
            AmazonRiver amazonRiver = (AmazonRiver) river;
            amazonRiver.getSalt();
        }
    }
}
