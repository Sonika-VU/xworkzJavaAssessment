package com.xworkz.busy.runner;

import com.xworkz.busy.external.TravelUser;
import com.xworkz.busy.internal.implementor.KsrtcBooking;
import com.xworkz.busy.internal.rules.TravelService;

public class TravelRunner {
    public static void main(String[] args) {
        TravelService travelService = new KsrtcBooking();
        TravelUser travelUser = new TravelUser(travelService);

        travelUser.plan();
    }
}
