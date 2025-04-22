package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.MapService;

public class MapUser {
    MapService mapService;
    public MapUser(MapService mapService){
        this.mapService = mapService;
        System.out.println("mapService-arg const of MapUser");
    }

    public void searchRoute(){
        System.out.println("Running searchRoute in MapUser");
        if(this.mapService != null){
            this.mapService.showRoute();
        }
    }
}
