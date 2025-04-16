package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.TrafficLight;

public class CityTrafficLight implements TrafficLight {
    @Override
    public void red() {
        System.out.println("Running red in CityTrafficLight");
    }

    @Override
    public void yellow() {
        System.out.println("Running yellow in CityTrafficLight");
    }

    @Override
    public void green() {
        System.out.println("Running green in CityTrafficLight");
    }
}
