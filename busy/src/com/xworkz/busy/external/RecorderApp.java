package com.xworkz.busy.external;

import com.xworkz.busy.internal.implementor.MobileAudioRecorder;
import com.xworkz.busy.internal.rules.AudioRecorder;

public class RecorderApp {
    AudioRecorder audioRecorder;

    public RecorderApp(AudioRecorder audioRecorder){
        this.audioRecorder = audioRecorder;
        System.out.println("audioRecorder-arg const of RecorderApp");
    }

    public void record(){
        System.out.println("Running record in RecorderApp");
        if(this.audioRecorder != null){
            this.audioRecorder.statRecording();
        }
    }
}
