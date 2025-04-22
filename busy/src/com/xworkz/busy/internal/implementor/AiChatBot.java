package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.ChatBot;

public class AiChatBot implements ChatBot {

    public AiChatBot(){
        System.out.println("no-arg const of AiChatBot");
    }

    @Override
    public void respond() {
        System.out.println("Running respond in AiChatBot");
    }
}
