package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Everest;
import com.xworkz.isARelation.Mountain;

public class Sadguru {
     public void climb(Mountain mountain){
         mountain.affectWeather();
         mountain.attractTourists();
         mountain.containMinerals();
         mountain.riseAboveLand();
         mountain.supportEcosystems();

         if(mountain instanceof Everest){
             Everest everest = (Everest) mountain;
             everest.getAir();
         }
     }
}
