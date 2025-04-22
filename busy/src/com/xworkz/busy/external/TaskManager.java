package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Scheduler;

public class TaskManager {
    Scheduler scheduler;

    public TaskManager (Scheduler scheduler){
        this.scheduler = scheduler;
        System.out.println("scheduler-arg const of TaskManager");
    }

    public void executeTask(){
        System.out.println("Running executeTask in TaskManager");
        if(this.scheduler != null){
            this.scheduler.schedule();
        }
    }
}
