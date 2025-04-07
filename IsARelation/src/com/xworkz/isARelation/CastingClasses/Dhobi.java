package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Appliance;
import com.xworkz.isARelation.WashingMachine;

public class Dhobi {
    public void cleanClothes(Appliance appliance){
        appliance.turnOn();
        appliance.showStatus();
        appliance.adjustSettings();
        appliance.scheduleTask();
        appliance.turnOff();

        if(appliance instanceof WashingMachine){
            WashingMachine washingMachine = (WashingMachine) appliance;
            washingMachine.washClothes();
        }

    }
}
