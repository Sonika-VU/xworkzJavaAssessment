package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.Blender;
import com.xworkz.interfaces.connectors.CoffeeMachine;

public class Cafe implements CoffeeMachine, Blender {

    @Override
    public void startBlending() {
        System.out.println("Running startBlending in Cafe");

    }

    @Override
    public void stopBlending() {
        System.out.println("Running stopBlending in Cafe");

    }

    @Override
    public void charge() {
        System.out.println("Running charge in Cafe");
    }

    @Override
    public void brew() {
        System.out.println("Running brew in Cafe");

    }

    @Override
    public void stop() {
        System.out.println("Running stop in Cafe");

    }

    @Override
    public void clean() {
        System.out.println("Running clean in Cafe");

    }

    @Override
    public void start() {
        System.out.println("Running start in Cafe");
    }
}
