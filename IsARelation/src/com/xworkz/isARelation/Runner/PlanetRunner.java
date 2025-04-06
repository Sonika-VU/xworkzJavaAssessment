package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Earth;
import com.xworkz.isARelation.Planet;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet = new Planet();
        Planet planet1 = new Earth();
        Earth earth = new Earth();

        System.out.println("===========================");
        planet.rotate();
        planet.hasAtmosphere();
        planet.hasGravity();
        planet.revolve();
        planet.supportLife();

        System.out.println("===========================");
        planet1.rotate();
        planet1.hasAtmosphere();
        planet1.hasGravity();
        planet1.revolve();
        planet1.supportLife();

        System.out.println("===========================");
        earth.rotate();
        earth.hasAtmosphere();
        earth.hasGravity();
        earth.revolve();
        earth.supportLife();
    }
}
