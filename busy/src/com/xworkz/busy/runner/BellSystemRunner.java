package com.xworkz.busy.runner;

import com.xworkz.busy.external.SchoolScheduler;
import com.xworkz.busy.internal.implementor.SchoolBellImpl;
import com.xworkz.busy.internal.rules.BellSystem;

public class BellSystemRunner {
    public static void main(String[] args) {
        BellSystem bellSystem = new SchoolBellImpl();
        SchoolScheduler schoolScheduler = new SchoolScheduler(bellSystem);

        schoolScheduler.setSchedule();
    }
}
