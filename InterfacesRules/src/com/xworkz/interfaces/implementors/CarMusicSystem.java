package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.MusicSystem;

public class CarMusicSystem implements MusicSystem {
    @Override
    public void playMusic() {
        System.out.println("Running playMusic in CarMusicSystem");
    }

    @Override
    public void stopMusic() {
        System.out.println("Running stopMusic in CarMusicSystem");
    }

    @Override
    public void shuffleSongs() {
        System.out.println("Running shuffleSongs in CarMusicSystem");
    }
}
