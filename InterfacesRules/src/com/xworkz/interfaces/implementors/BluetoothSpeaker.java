package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Speaker;

public class BluetoothSpeaker implements Speaker {

    @Override
    public void playSound() {
        System.out.println("Running playSound in BluetoothSpeaker");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Running increaseVolume in BluetoothSpeaker");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Running decreaseVolume in BluetoothSpeaker");
    }

    @Override
    public void connect() {
        System.out.println("Running connect in Speaker");
    }
}
