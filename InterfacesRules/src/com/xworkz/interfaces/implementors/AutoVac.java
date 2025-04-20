package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.RobotVacuum;

public class AutoVac implements RobotVacuum {
    @Override
    public void startCleaning() {
        System.out.println("Running startCleaning in AutoVac");
    }

    @Override
    public void returnToDock() {
        System.out.println("Running returnToDock in AutoVac");
    }

    @Override
    public void emptyDustbin() {
        System.out.println("Running emptyDustbin in AutoVac");
    }

    @Override
    public void sweep() {
        System.out.println("Running sweep in AutoVac");
    }
}
