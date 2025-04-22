package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.MapService;

public class GoogleMap implements MapService {

    public GoogleMap(){
        System.out.println("no-arg const of GoogleMap");
    }
    @Override
    public void showRoute() {
        System.out.println("Running showRoute in GoogleMap");
    }
}
