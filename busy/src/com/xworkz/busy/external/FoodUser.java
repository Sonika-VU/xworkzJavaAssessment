package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.FoodDeliveryService;

public class FoodUser {

    FoodDeliveryService foodDeliveryService;

    public FoodUser(FoodDeliveryService foodDeliveryService){
        this.foodDeliveryService = foodDeliveryService;
        System.out.println("foodDeliveryService-arg const of FoodUser");
    }

    public void serve(){
        System.out.println("Running serve inn FoodUser");
        if(this.foodDeliveryService != null){
            this.foodDeliveryService.orderFood();
        }
    }
}
