package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.WateringService;

public class WaterIrrigationImpl implements WateringService {

    public WaterIrrigationImpl(){
        System.out.println("no-arg const of WaterIrrigationImpl");
    }

    @Override
    public void provideWater() {
        System.out.println("Running provideWater in WaterIrrigationImpl");
    }
}
