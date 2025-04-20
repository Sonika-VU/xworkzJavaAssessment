package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.AlarmSystem;
import com.xworkz.interfaces.connectors.AquariumSystem;

public class AquaGuard implements AquariumSystem, AlarmSystem {

    @Override
    public void arm() {
        System.out.println("Running arm in Aquaguard");
    }

    @Override
    public void disarm() {
        System.out.println("Running disarm in Aquaguard");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Running triggerAlarm in Aquaguard");
    }

    @Override
    public void setSound() {
        System.out.println("Running setSound in Aquaguard");    }

    @Override
    public void feedFish() {
        System.out.println("Running feedFish in Aquaguard");
    }

    @Override
    public void cleanTank() {
        System.out.println("Running cleanTank in Aquaguard");
    }

    @Override
    public void checkTemperature() {
        System.out.println("Running checkTemperature in Aquaguard");
    }

    @Override
    public void addLights() {
        System.out.println("Running addLights in Aquaguard");    }
}
