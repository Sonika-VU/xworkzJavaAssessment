package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.MusicPlayer;

public class MediaPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Running play in MediaPlayer");
    }

    @Override
    public void pause() {
        System.out.println("Running pause in MediaPlayer");
    }

    @Override
    public void stop() {
        System.out.println("Running stop in MediaPlayer");
    }
}

