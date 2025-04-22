package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.NotificationService;

public class SmsNotification implements NotificationService {

    public SmsNotification(){
        System.out.println("no-arg const of SmsNotification");
    }

    @Override
    public void sendNotification() {
        System.out.println("Running sendNotification in SmsNotification");
    }
}
