package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.DeliveryService;

public class DeliverStation {
    DeliveryService deliveryService;

    public DeliverStation(DeliveryService deliveryService){
        this.deliveryService = deliveryService;
        System.out.println("deliverService-arg const of DeliverStation");
    }

    public void sendParcel(){
        System.out.println("Running sendParcel in DeliverStation");
        if(this.deliveryService != null){
            this.deliveryService.deliver();
        }
    }
}
