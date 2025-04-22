package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.TravelService;

public class KsrtcBooking implements TravelService {
    public KsrtcBooking (){
        System.out.println("no-arg const of KsrtcBooking");
    }
    @Override
    public void bookTicket() {
        System.out.println("Running bookTicket in KsrtcBooking");
    }
}
