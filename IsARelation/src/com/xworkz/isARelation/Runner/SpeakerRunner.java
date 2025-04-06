package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.BluetoothSpeaker;
import com.xworkz.isARelation.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker  = new Speaker();
        Speaker speaker1 = new BluetoothSpeaker();
        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();

        System.out.println("============================");
        speaker.decreaseVolume();
        speaker.mute();
        speaker.increaseVolume();
        speaker.playSound();
        speaker.powerOn();

        System.out.println("============================");
        speaker1.decreaseVolume();
        speaker1.mute();
        speaker1.increaseVolume();
        speaker1.playSound();
        speaker1.powerOn();

        System.out.println("============================");
        bluetoothSpeaker.decreaseVolume();
        bluetoothSpeaker.mute();
        bluetoothSpeaker.increaseVolume();
        bluetoothSpeaker.playSound();
        bluetoothSpeaker.powerOn();
    }
}
