package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.EmailService;

public class EmailClient {
    EmailService emailService;

    public EmailClient(EmailService emailService){
        this.emailService = emailService;
        System.out.println("emailService-arg const of EmailClient");
    }

    public void applyJob(){
        System.out.println("Running applyJob in EmailClient");
        if(this.emailService != emailService){
            this.emailService.sendEmail();
        }
    }
}
