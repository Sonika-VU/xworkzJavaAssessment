package com.xworkz.busy.runner;

import com.xworkz.busy.external.HomeMirrorUser;
import com.xworkz.busy.internal.implementor.SmartMirrorImpl;
import com.xworkz.busy.internal.rules.SmartMirror;

public class SmartMirrorRunner {
    public static void main(String[] args) {
        SmartMirror smartMirror = new SmartMirrorImpl();
        HomeMirrorUser homeMirrorUser = new HomeMirrorUser(smartMirror);

        homeMirrorUser.display();
    }

}
