package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Radio;

public class CarRadio implements Radio {
    @Override
    public void play() {
        System.out.println("Running play in CarRadio");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in CarRadio");
    }

    @Override
    public void changeStation() {
        System.out.println("Running changeStation in CarRadio");
    }
}
