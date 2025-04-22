package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.MessagingApp;

public class WhatsappMsg implements MessagingApp {

    public WhatsappMsg(){
        System.out.println("no-arg const of WhatsappMsg");
    }
    @Override
    public void sendMsg() {
        System.out.println("Running sendMsg in WhatsappMsg");
    }
}
