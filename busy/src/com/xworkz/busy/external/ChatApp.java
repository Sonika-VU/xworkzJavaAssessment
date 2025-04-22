package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.MessagingApp;

public class ChatApp {
    MessagingApp messagingApp ;

    public ChatApp(MessagingApp messagingApp){
        this.messagingApp = messagingApp;
        System.out.println("messagingApp-arg const of ChatApp");
    }

    public void chat(){
        System.out.println("Running chat in ChatApp");
        if(this.messagingApp != null){
            this.messagingApp.sendMsg();
        }
    }
}
