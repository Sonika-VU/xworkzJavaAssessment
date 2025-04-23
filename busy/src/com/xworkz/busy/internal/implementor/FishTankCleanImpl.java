package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.TankCleaner;

public class FishTankCleanImpl implements TankCleaner {
    public FishTankCleanImpl(){
        System.out.println("no-arg const of FishTankCleanImpl");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in FishTankCleanImpl");
    }
}
