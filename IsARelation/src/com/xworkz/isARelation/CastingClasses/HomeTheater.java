package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.BluetoothSpeaker;
import com.xworkz.isARelation.Speaker;

public class HomeTheater {

    public void  use(Speaker speaker){
        speaker.decreaseVolume();
        speaker.mute();
        speaker.increaseVolume();
        speaker.playSound();
        speaker.powerOn();

        if(speaker instanceof BluetoothSpeaker){
            BluetoothSpeaker bluetoothSpeaker = (BluetoothSpeaker) speaker;
            bluetoothSpeaker.connect();
        }
    }
}
