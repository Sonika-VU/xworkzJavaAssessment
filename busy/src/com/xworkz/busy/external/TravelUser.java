package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.TravelService;

public class TravelUser {
    TravelService travelService ;
    public TravelUser(TravelService travelService){
        this.travelService = travelService;
        System.out.println("travelServicea-arg const of TravelUser");
    }

    public void plan(){
        System.out.println("Running plan in TravelUser");
        if(this.travelService != null){
            this.travelService.bookTicket();
        }
    }
}
