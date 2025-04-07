package com.xworkz.isARelation;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        super();
        System.out.println("no-arg const of BluetoothSpeaker");
    }

    @Override
    public void playSound(){
//        super.playSound();
        System.out.println("Running playSound in BluetoothSpeaker");
    }

    @Override
    public void increaseVolume(){
//        super.increaseVolume();
        System.out.println("Running increaseVolume in BluetoothSpeaker");
    }

    @Override
    public void decreaseVolume(){
//        super.decreaseVolume();
        System.out.println("Running decreaseVolume in BluetoothSpeaker");
    }

    @Override
    public void mute(){
//        super.mute();
        System.out.println("Running mute in BluetoothSpeaker");
    }

    @Override
    public void powerOn(){
//        super.powerOn();
        System.out.println("Running powerOn in BluetoothSpeaker");
    }

    public void connect(){
        System.out.println("Running connect in BluetoothSpeaker");
    }
}
