package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.StopWatch;

public class DigitalStopwatch implements StopWatch {

    @Override
    public void start() {
        System.out.println("Running start in DigitalStopwatch");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in DigitalStopwatch");
    }

    @Override
    public void reset() {
        System.out.println("Running reset in DigitalStopwatch");
    }
}
