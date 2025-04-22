package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.EmailService;

public class GmailServiceImpl implements EmailService {
    public GmailServiceImpl(){
        System.out.println("no-arg const of GmailServiceImpl");
    }

    @Override
    public void sendEmail() {
        System.out.println("Running sendEmail in GmailServiceImpl");
    }
}
