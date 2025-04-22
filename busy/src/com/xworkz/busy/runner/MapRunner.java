package com.xworkz.busy.runner;

import com.xworkz.busy.external.MapUser;
import com.xworkz.busy.internal.implementor.GoogleMap;
import com.xworkz.busy.internal.rules.MapService;

public class MapRunner {
    public static void main(String[] args) {
        MapService mapService = new GoogleMap();
        MapUser mapUser = new MapUser(mapService);

        mapUser.searchRoute();
    }
}
