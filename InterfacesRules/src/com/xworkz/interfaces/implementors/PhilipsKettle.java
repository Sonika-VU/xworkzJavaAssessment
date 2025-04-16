package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.ElectricKettle;

public class PhilipsKettle implements ElectricKettle {
    @Override
    public void startBoiling() {
        System.out.println("Running startBoiling in PhilipsKettle");
    }

    @Override
    public void stopBoiling() {
        System.out.println("Running stopBoiling in PhilipsKettle");
    }

    @Override
    public void showTemperature() {
        System.out.println("Running showTemperature in PhilipsKettle");
    }
}
