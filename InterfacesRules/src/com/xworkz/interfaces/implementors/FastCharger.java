package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.BatteryCharger;

public class FastCharger implements BatteryCharger {
    @Override
    public void startCharging() {
        System.out.println("Running startCharging in FastCharger");
    }

    @Override
    public void stopCharging() {
        System.out.println("Running stopCharging in FastCharger");
    }

    @Override
    public void showBatteryLevel() {
        System.out.println("Running showBatteryLevel in FastCharger");
    }
}
