package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Boat;
import com.xworkz.isARelation.Sailboat;

public class BoatSailer {
    public void sail(Boat boat){
        boat.anchor();
        boat.floatOnWater();
        boat.slowDown();
        boat.steer();
        boat.speedUp();

        if(boat instanceof Sailboat){
            Sailboat sailboat = (Sailboat) boat;
            sailboat.allowPeople();
        }
    }
}
