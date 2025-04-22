package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.LightController;

public class PhilipsLightImpl implements LightController {

    public PhilipsLightImpl(){
        System.out.println("no-arg const of PhilipsLightImpl");
    }
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in PhilipsLightImpl");
    }
}
