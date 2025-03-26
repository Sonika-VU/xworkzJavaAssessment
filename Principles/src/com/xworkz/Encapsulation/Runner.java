package com.xworkz.Encapsulation;

import com.xworkz.Encapsulation.external.Researcher;
import com.xworkz.Encapsulation.internal.Bulb;
import com.xworkz.Encapsulation.internal.Nasa;

import java.nio.Buffer;

public class Runner {
    public static void main(String[] args) {
        Nasa nasa = new Nasa();
        Researcher researcher = new Researcher();

        nasa.manufactureRocket();
        researcher.researchOnRocket();

        System.out.println("=============================");

        Bulb bulb = new Bulb();
        String volts = bulb.getVolts();
        System.out.println("Bulb of volts : "+volts);

    }
}
