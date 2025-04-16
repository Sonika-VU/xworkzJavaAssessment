package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Dishwasher;

public class BoschDishwasher implements Dishwasher {
    @Override
    public void startWash() {
        System.out.println("Running startWash in BoschDishwasher");
    }

    @Override
    public void stopWash() {
        System.out.println("Running stoptWash in BoschDishwasher");
    }

    @Override
    public void dryDishes() {
        System.out.println("Running dryDishes in BoschDishwasher");
    }
}
