package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.FoodDeliveryService;

public class SwiggyFDApp implements FoodDeliveryService {
    public SwiggyFDApp(){
        System.out.println("no-arg cosnt of SwiggyFDApp");
    }

    @Override
    public void orderFood() {
        System.out.println("Running orderFood in SwiggyFDApp");
    }
}
