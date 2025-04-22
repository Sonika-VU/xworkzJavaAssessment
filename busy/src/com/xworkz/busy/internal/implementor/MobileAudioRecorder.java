package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.AudioRecorder;

public class MobileAudioRecorder implements AudioRecorder {
    public MobileAudioRecorder(){
        System.out.println("no-arg const of MobileAudioRecorder");
    }

    @Override
    public void statRecording() {
        System.out.println("Running statRecording in MobileAudioRecorder");
    }
}
