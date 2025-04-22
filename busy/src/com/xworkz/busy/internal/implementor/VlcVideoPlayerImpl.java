package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.VideoPlayer;

public class VlcVideoPlayerImpl implements VideoPlayer {
    public VlcVideoPlayerImpl(){
        System.out.println("no-arg const of VlcVideoPlayerImpl");
    }
    @Override
    public void playVideo() {
        System.out.println("Running playVideo in VlcVideoPlayerImpl");
    }
}
