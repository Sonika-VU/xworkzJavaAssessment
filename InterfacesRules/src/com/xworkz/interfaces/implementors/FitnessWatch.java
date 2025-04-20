package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartWatch;

public class FitnessWatch implements SmartWatch {
    @Override
    public void showTime() {
        System.out.println("Running showTime in FitnessWatch");
    }

    @Override
    public void trackSteps() {
        System.out.println("Running trackSteps in FitnessWatch");
    }

    @Override
    public void measureHeartRate() {
        System.out.println("Running measureHeartRate in FitnessWatch");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in FitnessWatch");
    }
}
