package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.WhatsApp;

public class whatsAppUser implements WhatsApp {
    @Override
    public void sendMsg() {
        System.out.println("Running sendMsg in WhatsApp");
    }

    @Override
    public void receiveMsg() {
        System.out.println("Running receiveMsg in WhatsApp");

    }

    @Override
    public void sendVoiceMsg() {
        System.out.println("Running sendVoiceMsg in WhatsApp");

    }

}
