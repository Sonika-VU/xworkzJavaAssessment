package com.xworkz.busy.runner;

import com.xworkz.busy.external.ChatBotUser;
import com.xworkz.busy.internal.implementor.AiChatBot;
import com.xworkz.busy.internal.rules.ChatBot;

public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot chatBot = new AiChatBot();
        ChatBotUser chatBotUser = new ChatBotUser(chatBot);

        chatBotUser.request();
    }
}
