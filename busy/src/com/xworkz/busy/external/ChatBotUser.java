package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.ChatBot;

public class ChatBotUser {

    ChatBot chatBot ;

    public ChatBotUser(ChatBot chatBot ){
        this.chatBot  = chatBot;
        System.out.println("chatBot-arg const of ChatBotUser");
    }

    public void request(){
        System.out.println("Running request in ChatBotUser");
        if(this.chatBot != null){
            this.chatBot.respond();
        }
    }
}
