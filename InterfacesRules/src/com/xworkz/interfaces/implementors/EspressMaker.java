package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.CoffeeMachine;

public class EspressMaker implements CoffeeMachine {
    @Override
    public void brew() {
        System.out.println("Running brew in EspressoMaker");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in EspressoMaker");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in EspressoMaker");
    }

    @Override
    public void start() {
        System.out.println("Running start in EspressMaker");

    }
}
