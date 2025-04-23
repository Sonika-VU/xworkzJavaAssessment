package com.xworkz.busy.runner;

import com.xworkz.busy.external.TouristResort;
import com.xworkz.busy.internal.implementor.CoorgResortImpl;
import com.xworkz.busy.internal.rules.ResortService;

public class ResortRunner {
    public static void main(String[] args) {
        ResortService resortService = new CoorgResortImpl();
        TouristResort touristResort = new TouristResort(resortService);

        touristResort.stay();
    }
}
