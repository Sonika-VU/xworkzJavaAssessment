package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.MusicPlayer;

public class MusicListener {

    MusicPlayer musicPlayer;
    public MusicListener(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
        System.out.println("musicPlayer-arg const of MusicListener");
    }

    public void listen(){
        System.out.println("Running listen in MusicListener");
        if (this.musicPlayer != null ){
            this.musicPlayer.playSong();
        }
    }
}
