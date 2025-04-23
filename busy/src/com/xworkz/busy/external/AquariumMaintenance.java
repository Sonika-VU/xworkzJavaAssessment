package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.TankCleaner;

public class AquariumMaintenance {

    TankCleaner tankCleaner;

    public AquariumMaintenance(TankCleaner tankCleaner){
        this.tankCleaner = tankCleaner;
        System.out.println("tankCleaner-arg const of AquariumMaintenance");
    }

    public void cleanFishTank(){
        System.out.println("Running cleanFishTank in AquariumMaintenance");
        if(this.tankCleaner != null){
            this.tankCleaner.clean();
        }
    }
}
