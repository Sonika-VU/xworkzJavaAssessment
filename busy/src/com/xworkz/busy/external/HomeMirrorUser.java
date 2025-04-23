package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.SmartMirror;

public class HomeMirrorUser {
    SmartMirror smartMirror;

    public HomeMirrorUser(SmartMirror smartMirror){
        this.smartMirror = smartMirror;
        System.out.println("smartMirror-arg const of HomeMirrorUser");
    }

    public void display(){
        System.out.println("Running display in HomeMirrorUser");
        if(this.smartMirror != null){
            this.smartMirror.displayWeather();
        }
    }
}
