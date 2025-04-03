package com.xworkz.isARelation;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        super();
        System.out.println("no-arg const of BluetoothSpeaker");
    }

    {
        super.playSound();
        System.out.println("Running playSound in BluetoothSpeaker");
    }

    {
        super.increaseVolume();
        System.out.println("Running increaseVolume in BluetoothSpeaker");
    }

    {
        super.decreaseVolume();
        System.out.println("Running decreaseVolume in BluetoothSpeaker");
    }

    {
        super.mute();
        System.out.println("Running mute in BluetoothSpeaker");
    }

    {
        super.powerOn();
        System.out.println("Running powerOn in BluetoothSpeaker");
    }
}
