package com.xworkz.busy.runner;

import com.xworkz.busy.external.AquariumMaintenance;
import com.xworkz.busy.internal.implementor.FishTankCleanImpl;
import com.xworkz.busy.internal.rules.TankCleaner;

public class TabkCleanerRunner {
    public static void main(String[] args) {
        TankCleaner tankCleaner = new FishTankCleanImpl();
        AquariumMaintenance aquariumMaintenance = new AquariumMaintenance(tankCleaner);

        aquariumMaintenance.cleanFishTank();
    }
}
