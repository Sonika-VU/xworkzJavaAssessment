package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.SmartTV;
import com.xworkz.isARelation.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television television = new Television();
        Television television1 = new SmartTV();
        SmartTV smartTV = new SmartTV();

        System.out.println("==========================");
        television.changeChannel();
        television.decreaseVolume();
        television.increaseVolume();
        television.turnOn();
        television.turnOff();

        System.out.println("==========================");
        television1.changeChannel();
        television1.decreaseVolume();
        television1.increaseVolume();
        television1.turnOn();
        television1.turnOff();

        System.out.println("==========================");
        smartTV.changeChannel();
        smartTV.decreaseVolume();
        smartTV.increaseVolume();
        smartTV.turnOn();
        smartTV.turnOff();
    }
}
