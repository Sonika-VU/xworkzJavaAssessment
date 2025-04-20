package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.RemoteController;

public class TVRemote implements RemoteController {
    @Override
    public void powerOn() {
        System.out.println("Running powerOn in TVRemote");
    }
    @Override
    public void powerOff() {
        System.out.println("Running powerOff in TVRemote");
    }

    @Override
    public void volumeUp() {
        System.out.println("Running volumeUp in TVRemote");
    }
}
