package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.FridgeMonitor;

public class IotFridgeImpl implements FridgeMonitor {
    public IotFridgeImpl(){
        System.out.println("no-arg const of IotFridgeImpl");
    }
    @Override
    public void checkInventory() {
        System.out.println("Running checkInventory in IotFridgeImpl");
    }
}
