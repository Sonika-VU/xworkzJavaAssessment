package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.ResortService;

public class TouristResort {
    ResortService resortService;

    public TouristResort(ResortService resortService){
        this.resortService = resortService;
        System.out.println("resortService-arg const of TouristResort");
    }

    public void stay(){
        System.out.println("Running stay in TouristResort");
        if (this.resortService != null){
            this.resortService.provideRoom();
        }
    }
}
