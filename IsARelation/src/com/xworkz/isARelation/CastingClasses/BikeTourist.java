package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Bike;
import com.xworkz.isARelation.MountainBike;

public class BikeTourist {
    public void climbMountain(Bike bike){
        bike.accelerate();
        bike.honk();
        bike.start();
        bike.brake();
        bike.stop();

        if(bike instanceof MountainBike){
            MountainBike mountainBike = (MountainBike) bike;
            mountainBike.gears();
        }
    }
}
