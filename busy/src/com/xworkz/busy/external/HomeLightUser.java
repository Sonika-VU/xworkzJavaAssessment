package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.LightController;

public class HomeLightUser {
    LightController lightController;

    public HomeLightUser(LightController lightController){
        this.lightController = lightController;
        System.out.println("lightController-arg const of HomeLightUser");
    }

    public void useLight(){
        System.out.println("Running useLight in HomeLightUser");
        if(this.lightController != null){
            this.lightController.turnOn();
        }
    }
}
