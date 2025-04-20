package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.VacuumCleaner;

public class RoboVac implements VacuumCleaner {
    @Override
    public void start() {
        System.out.println("Running start in RoboVac");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in RoboVac");
    }

    @Override
    public void autoClean() {
        System.out.println("Running autoClean in RoboVac");
    }

    @Override
    public void sweep() {
        System.out.println("Running sweep in RoboVac");

    }
}
