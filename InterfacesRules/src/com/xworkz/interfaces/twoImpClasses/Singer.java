package com.xworkz.interfaces.twoImpClasses;

import com.xworkz.interfaces.connectors.MusicPlayer;
import com.xworkz.interfaces.connectors.SmartMirror;

public class Singer implements SmartMirror, MusicPlayer {
    @Override
    public void play() {
        System.out.println("Running play in Singer");
    }

    @Override
    public void pause() {
        System.out.println("Running pause in Singer");

    }

    @Override
    public void stop() {
        System.out.println("Running stop in Singer");
    }

    @Override
    public void showWeather() {
        System.out.println("Running showWeather in Singer");

    }

    @Override
    public void showTime() {
        System.out.println("Running showTime in Singer");

    }

    @Override
    public void turnOffDisplay() {
        System.out.println("Running turnOffDisplay in Singer");

    }
}
