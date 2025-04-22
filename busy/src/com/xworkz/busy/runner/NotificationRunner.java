package com.xworkz.busy.runner;

import com.xworkz.busy.external.NotificationUser;
import com.xworkz.busy.internal.implementor.SmsNotification;
import com.xworkz.busy.internal.rules.NotificationService;

public class NotificationRunner {
    public static void main(String[] args) {
        NotificationService notificationService = new SmsNotification();
        NotificationUser notificationUser = new NotificationUser(notificationService);

        notificationUser.receive();
    }
}
