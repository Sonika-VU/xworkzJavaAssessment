package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Constitution;

public class CitizenConstitutionImpl implements Constitution {

    public CitizenConstitutionImpl(){
        System.out.println("no-arg const of CitizenConstitutionImpl");
    }
    @Override
    public void followLaws() {
        System.out.println("Running followsLaws in CitizenConstitutionImpl");
    }
}
