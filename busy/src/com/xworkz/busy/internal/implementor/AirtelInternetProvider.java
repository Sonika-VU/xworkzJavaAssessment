package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.InternetProvider;

public class AirtelInternetProvider implements InternetProvider {
    public AirtelInternetProvider(){
        System.out.println("no-arg cosnt of AirtelInternetProvider");
    }
    @Override
    public void provide() {
        System.out.println("Running provide in AirtelInternetProvider");
    }
}
