package com.xworkz.Encapsulation.external;

import com.xworkz.Encapsulation.internal.Rocket;

public class Researcher {
    Rocket rocket = new Rocket();

    public Researcher(){
        System.out.println("no-arg const of Researcher");
    }

    public void researchOnRocket(){
        System.out.println("Running researchOnRocket in Researcher");
        System.out.println("Fuel Type : "+rocket.getFuelType());
        System.out.println("Fuel Level : "+rocket.getFuelLevel());
    }
}
