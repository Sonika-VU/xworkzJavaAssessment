package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.VideoPlayer;

public class VideoPlayerUser {
    VideoPlayer videoPlayer;

    public VideoPlayerUser(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
        System.out.println("videoPlayer-arg const of VideoPlayerUser");
    }

    public void start(){
        System.out.println("Running start in VideoPlayerUser");
        if(this.videoPlayer != null){
            this.videoPlayer.playVideo();
        }
    }
}
