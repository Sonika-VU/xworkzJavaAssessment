package com.xworkz.busy.runner;

import com.xworkz.busy.external.EmailClient;
import com.xworkz.busy.internal.implementor.GmailServiceImpl;
import com.xworkz.busy.internal.rules.EmailService;

public class EmailRunner {
    public static void main(String[] args) {
        EmailService emailService = new GmailServiceImpl();
        EmailClient emailClient = new EmailClient(emailService);
        emailClient.applyJob();
    }
}
