package com.xworkz.busy.runner;

import com.xworkz.busy.external.TaskManager;
import com.xworkz.busy.internal.implementor.DailySchedulerImpl;
import com.xworkz.busy.internal.rules.Scheduler;

public class SchedulerRunner {
    public static void main(String[] args) {
        Scheduler scheduler = new DailySchedulerImpl();
        TaskManager taskManager = new TaskManager(scheduler);

        taskManager.executeTask();
    }
}
