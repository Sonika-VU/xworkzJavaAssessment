package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Jio;
import com.xworkz.isARelation.Reliance;

public class MobileShop {

    public void sell(Reliance reliance){
        reliance.advertise();
        reliance.constructOffice();
        reliance.getEmployees();
        reliance.setGoals();
        reliance.setSalary();

        if(reliance instanceof Jio){
            Jio jio = (Jio) reliance;
            jio.issueSim();
        }
    }
}
