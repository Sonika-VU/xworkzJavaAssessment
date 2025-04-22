package com.xworkz.busy.runner;

import com.xworkz.busy.external.VideoPlayerUser;
import com.xworkz.busy.internal.implementor.VlcVideoPlayerImpl;
import com.xworkz.busy.internal.rules.VideoPlayer;

public class VideoPlayerRunner {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VlcVideoPlayerImpl();
        VideoPlayerUser videoPlayerUser = new VideoPlayerUser(videoPlayer);

        videoPlayerUser.start();
    }
}
