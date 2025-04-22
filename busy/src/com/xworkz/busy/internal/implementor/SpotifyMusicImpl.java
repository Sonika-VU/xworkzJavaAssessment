package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.MusicPlayer;

public class SpotifyMusicImpl implements MusicPlayer {
    public SpotifyMusicImpl(){
        System.out.println("no-arg const of SpotifyMusicImpl");
    }
    @Override
    public void playSong() {
        System.out.println("Running playSong in SpotifyMusicImpl");
    }
}
