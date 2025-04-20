package com.xworkz.interfaces.connectors;

public interface AlarmClock {
    void setAlarm();
    void ring();
    void snooze();

    default void tellTime(){
        System.out.println("Running tellTime in AlarmClock");
    }
}
