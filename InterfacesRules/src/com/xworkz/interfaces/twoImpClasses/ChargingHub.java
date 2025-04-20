package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.BatteryCharger;
import com.xworkz.interfaces.connectors.Microwave;

public class ChargingHub implements BatteryCharger, Microwave {

    @Override
    public void startCharging() {
        System.out.println();
    }

    @Override
    public void stopCharging() {

    }

    @Override
    public void showBatteryLevel() {

    }

    @Override
    public void store() {
        BatteryCharger.super.store();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void openDoor() {

    }

    @Override
    public void heat() {
        Microwave.super.heat();
    }
}
