package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.ElectricityProvider;

public class BescomElecImpl implements ElectricityProvider {
    public BescomElecImpl(){
        System.out.println("no-arg const of BescomElecImpl");
    }

    @Override
    public void supplyElectricity() {
        System.out.println("Running supplyElectricity in BescomElecImpl");
    }
}
