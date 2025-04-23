package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.FridgeMonitor;

public class KitchenAssistance {
    FridgeMonitor fridgeMonitor;

    public KitchenAssistance(FridgeMonitor fridgeMonitor){
        this.fridgeMonitor = fridgeMonitor;
        System.out.println("fridgeMonitor-arg const of KitchenAssistance");
    }

    public void setInventory(){
        System.out.println("Running setInventory in KitchenAssistance");
        if(this.fridgeMonitor != null){
            this.fridgeMonitor.checkInventory();
        }
    }
}
