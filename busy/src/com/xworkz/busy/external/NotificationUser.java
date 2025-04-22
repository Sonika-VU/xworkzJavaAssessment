package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.NotificationService;

public class NotificationUser {
    NotificationService notificationService;

    public NotificationUser(NotificationService notificationService){
        this.notificationService = notificationService;
        System.out.println("notificationService-arg const of NotificationUser");
    }

    public void receive(){
        System.out.println("Running receive in NotificationUser");
        if(this.notificationService != null){
            notificationService.sendNotification();
        }
    }
}
