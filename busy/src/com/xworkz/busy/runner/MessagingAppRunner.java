package com.xworkz.busy.runner;

import com.xworkz.busy.external.ChatApp;
import com.xworkz.busy.internal.implementor.WhatsappMsg;
import com.xworkz.busy.internal.rules.MessagingApp;

public class MessagingAppRunner {
    public static void main(String[] args) {
        MessagingApp messagingApp = new WhatsappMsg();

        ChatApp chatApp = new ChatApp(messagingApp);

        chatApp.chat();
    }
}
