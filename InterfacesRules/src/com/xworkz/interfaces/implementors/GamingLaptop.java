package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Laptop;

public class GamingLaptop implements Laptop {
    @Override
    public void bootUp() {
        System.out.println("Running bootUp in GamingLaptop");
    }

    @Override
    public void shutDown() {
        System.out.println("Running shutDown in GamingLaptop");
    }

    @Override
    public void sleep() {
        System.out.println("Running sleep in GamingLaptop");
    }
}
