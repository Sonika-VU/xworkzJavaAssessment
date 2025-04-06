package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Mobile;
import com.xworkz.isARelation.SmartPhone;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Mobile mobile1 = new SmartPhone();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println("=========================");
        mobile.capturePhoto();
        mobile.makeCall();
        mobile.sendSMS();
        mobile.setAlarm();
        mobile.playGame();

        System.out.println("=========================");
        mobile1.capturePhoto();
        mobile1.makeCall();
        mobile1.sendSMS();
        mobile1.setAlarm();
        mobile1.playGame();

        System.out.println("=========================");
        smartPhone.capturePhoto();
        smartPhone.makeCall();
        smartPhone.sendSMS();
        smartPhone.setAlarm();
        smartPhone.playGame();


    }
}
