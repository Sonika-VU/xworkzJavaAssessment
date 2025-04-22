package com.xworkz.busy.external;

import com.xworkz.busy.internal.implementor.CitizenConstitutionImpl;
import com.xworkz.busy.internal.rules.Constitution;

public class Government {

    Constitution constitution;
    public Government(Constitution constitution){
        System.out.println("citizenConstitutionImpl-arg const of Government");
        this.constitution = constitution;
    }

    public void rule(){
        System.out.println("Running rule in Government");
        if(this.constitution != null){
            this.constitution.followLaws();
        }
    }
}
