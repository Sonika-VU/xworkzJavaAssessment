package com.xworkz.busy.runner;

import com.xworkz.busy.external.RecorderApp;
import com.xworkz.busy.internal.implementor.MobileAudioRecorder;
import com.xworkz.busy.internal.rules.AudioRecorder;

public class RecorderRunner {
    public static void main(String[] args) {
        AudioRecorder audioRecorder = new MobileAudioRecorder();
        RecorderApp recorderApp = new RecorderApp(audioRecorder);

        recorderApp.record();
    }
}
