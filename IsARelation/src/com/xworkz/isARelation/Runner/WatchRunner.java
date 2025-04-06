package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.SmartWatch;
import com.xworkz.isARelation.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch();
        Watch watch1 = new SmartWatch();
        SmartWatch smartWatch = new SmartWatch();

        System.out.println("===========================");
        watch.checkPulseRate();
        watch.hangOnWall();
        watch.setAlarm();
        watch.showTime();
        watch.tieOnWrist();

        System.out.println("===========================");
        watch1.checkPulseRate();
        watch1.hangOnWall();
        watch1.setAlarm();
        watch1.showTime();
        watch1.tieOnWrist();

        System.out.println("===========================");
        smartWatch.checkPulseRate();
        smartWatch.hangOnWall();
        smartWatch.setAlarm();
        smartWatch.showTime();
        smartWatch.tieOnWrist();
    }
}
