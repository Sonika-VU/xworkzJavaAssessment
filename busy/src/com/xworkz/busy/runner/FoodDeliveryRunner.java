package com.xworkz.busy.runner;

import com.xworkz.busy.external.FoodUser;
import com.xworkz.busy.internal.implementor.SwiggyFDApp;
import com.xworkz.busy.internal.rules.FoodDeliveryService;

public class FoodDeliveryRunner {
    public static void main(String[] args) {
        FoodDeliveryService foodDeliveryService = new SwiggyFDApp();
        FoodUser foodUser = new FoodUser(foodDeliveryService);

        foodUser.serve();
    }
}
