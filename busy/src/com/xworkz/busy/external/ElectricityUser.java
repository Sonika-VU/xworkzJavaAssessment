package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.ElectricityProvider;

public class ElectricityUser {

    ElectricityProvider electricityProvider;

    public ElectricityUser(ElectricityProvider electricityProvider){
        this.electricityProvider = electricityProvider;
        System.out.println("electricityProvider-arg cosnt of ElectricityUser" );
    }

    public void provide(){
        System.out.println("Running provide in ElectricityUser");
        if(this.electricityProvider != null){
            this.electricityProvider.supplyElectricity();
        }
    }
}
