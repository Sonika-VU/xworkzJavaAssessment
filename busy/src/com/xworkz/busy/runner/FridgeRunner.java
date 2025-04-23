package com.xworkz.busy.runner;

import com.xworkz.busy.external.KitchenAssistance;
import com.xworkz.busy.internal.implementor.IotFridgeImpl;
import com.xworkz.busy.internal.rules.FridgeMonitor;

public class FridgeRunner {
    public static void main(String[] args) {
        FridgeMonitor fridgeMonitor = new IotFridgeImpl();
        KitchenAssistance kitchenAssistance = new KitchenAssistance(fridgeMonitor);

        kitchenAssistance.setInventory();
    }
}
