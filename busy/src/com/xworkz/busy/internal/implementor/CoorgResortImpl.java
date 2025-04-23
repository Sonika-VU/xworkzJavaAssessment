package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.ResortService;

public class CoorgResortImpl implements ResortService {

    public CoorgResortImpl(){
        System.out.println("no-arg const of CoorgResortImpl");
    }

    @Override
    public void provideRoom() {
        System.out.println("Running provideRoom in CoorgResortImpl");
    }
}
