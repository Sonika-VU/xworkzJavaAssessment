package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Bulb;
import com.xworkz.isARelation.Light;

public class LightRunner {
    public static void main(String[] args) {
        Light light = new Light();
        Light light1 = new Bulb();
        Bulb bulb = new Bulb();

        System.out.println("========================");
        light.decorate();
        light.displayObject();
        light.hangIt();
        light.turnOn();
        light.turnOff();

        System.out.println("========================");
        light1.decorate();
        light1.displayObject();
        light1.hangIt();
        light1.turnOn();
        light1.turnOff();

        System.out.println("========================");
        bulb.decorate();
        bulb.displayObject();
        bulb.hangIt();
        bulb.turnOn();
        bulb.turnOff();

    }
}
