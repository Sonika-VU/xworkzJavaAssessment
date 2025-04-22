package com.xworkz.busy.runner;

import com.xworkz.busy.external.ElectricityUser;
import com.xworkz.busy.internal.implementor.BescomElecImpl;
import com.xworkz.busy.internal.rules.ElectricityProvider;

public class ElectricityRunner {
    public static void main(String[] args) {
        ElectricityProvider electricityProvider = new BescomElecImpl();

        ElectricityUser electricityUser = new ElectricityUser(electricityProvider);

        electricityUser.provide();
    }
}
