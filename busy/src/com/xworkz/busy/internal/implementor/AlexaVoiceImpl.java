package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.VoiceAssistant;

public class AlexaVoiceImpl implements VoiceAssistant {

    public AlexaVoiceImpl(){
        System.out.println("no-arg const of AlexaVoiceImpl");
    }
    @Override
    public void executeCommand() {
        System.out.println("Running executeCommand in AlexaVoiceImpl");
    }
}
