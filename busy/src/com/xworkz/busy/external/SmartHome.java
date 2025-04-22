package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.VoiceAssistant;

public class SmartHome {
    VoiceAssistant voiceAssistant ;

    public SmartHome(VoiceAssistant voiceAssistant){
        this.voiceAssistant = voiceAssistant;
        System.out.println("voiceAssistant-arg const of SmartHome");
    }

    public void talk(){
        System.out.println("Running  talk in SmartHome");
        if(this.voiceAssistant != null){
            this.voiceAssistant.executeCommand();
        }
    }
}
