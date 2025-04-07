package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Earth;
import com.xworkz.isARelation.Planet;

public class SolarSystem {

    public void rotatePlanets(Planet planet){
        planet.rotate();
        planet.hasAtmosphere();
        planet.hasGravity();
        planet.revolve();
        planet.supportLife();

        if(planet instanceof Earth){
            Earth earth = (Earth) planet;
            earth.hasMoon();
        }
    }
}
