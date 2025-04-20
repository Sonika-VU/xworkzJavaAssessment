package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.SmartSpeaker;

public class EchoSpeaker implements SmartSpeaker {
    @Override
    public void playSong() {
        System.out.println("Running playSong in EchoSpeaker");
    }

    @Override
    public void stopSong() {
        System.out.println("Running stopSong in EchoSpeaker");
    }

    @Override
    public void tellTime() {
        System.out.println("Running tellTime in EchoSpeaker");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in EchoSpeaker");
    }
}
