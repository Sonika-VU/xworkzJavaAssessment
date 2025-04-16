package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.WashingMachine;

public class LGWasher implements WashingMachine {

    @Override
    public void startWash() {
        System.out.println("Running startWash in LGWasher");
    }

    @Override
    public void rinse() {
        System.out.println("Running rinse in LGWasher");
    }

    @Override
    public void spin() {
        System.out.println("Running spin in LGWasher");
    }
}
