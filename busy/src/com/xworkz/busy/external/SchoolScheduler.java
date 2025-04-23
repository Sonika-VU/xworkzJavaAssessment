package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.BellSystem;

public class SchoolScheduler {
    BellSystem bellSystem;

    public SchoolScheduler (BellSystem bellSystem){
        this.bellSystem = bellSystem;
        System.out.println("bellSystem-arg const fo SchoolScheduler");
    }

    public void setSchedule(){
        System.out.println("Running setSchedule in SchoolScheduler");
        if(this.bellSystem != null){
            this.bellSystem.ringBell();
        }
    }
}
