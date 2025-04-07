package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Mobile;
import com.xworkz.isARelation.SmartPhone;

public class PhoneUser {

    public void usePhone(Mobile mobile){
        mobile.capturePhoto();
        mobile.makeCall();
        mobile.sendSMS();
        mobile.setAlarm();
        mobile.playGame();

        if(mobile instanceof SmartPhone){
            SmartPhone smartPhone = (SmartPhone) mobile;
            smartPhone.setRemainder();
        }
    }
}
