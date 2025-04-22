package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Scheduler;

public class DailySchedulerImpl implements Scheduler {

    public DailySchedulerImpl(){
        System.out.println("no-arg const of DailySchedulerImpl");
    }
    @Override
    public void schedule() {
        System.out.println("Running schedule in DailySchedulerImpl");
    }
}
