package com.xworkz.busy.runner;

import com.xworkz.busy.external.MusicListener;
import com.xworkz.busy.internal.implementor.SpotifyMusicImpl;
import com.xworkz.busy.internal.rules.MusicPlayer;

public class MusicPlayerRunner {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new SpotifyMusicImpl();
        MusicListener musicListener = new MusicListener(musicPlayer);

        musicListener.listen();
    }
}
