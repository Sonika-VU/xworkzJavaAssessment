package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.SmartWatch;
import com.xworkz.isARelation.Watch;

public class WatchUSer {

    public void wear(Watch watch){
        watch.checkPulseRate();
        watch.hangOnWall();
        watch.setAlarm();
        watch.showTime();
        watch.tieOnWrist();

        if(watch instanceof SmartWatch){
            SmartWatch smartWatch = (SmartWatch) watch;
            smartWatch.capturePhoto();
        }
    }
}
