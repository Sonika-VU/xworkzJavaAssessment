package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.HomeTheater;

public class LivingRoomTheater implements HomeTheater {
    @Override
    public void playMovie() {
        System.out.println("Running playMovie in LivingRoomTheater");
    }

    @Override
    public void pauseMovie() {
        System.out.println("Running pauseMovie in LivingRoomTheater");
    }

    @Override
    public void stopMovie() {
        System.out.println("Running stopMovie in LivingRoomTheater");
    }
}
