package com.xworkz.busy.runner;

import com.xworkz.busy.external.SmartHome;
import com.xworkz.busy.internal.implementor.AlexaVoiceImpl;
import com.xworkz.busy.internal.rules.VoiceAssistant;

public class VoiceAssitRunner {
    public static void main(String[] args) {
        VoiceAssistant voiceAssistant = new AlexaVoiceImpl();
        SmartHome smartHome = new SmartHome(voiceAssistant);

        smartHome.talk();
    }
}
