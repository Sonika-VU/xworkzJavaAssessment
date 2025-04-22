package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Icc;

public class IndianCricketTeamIccImpl implements Icc {

    public IndianCricketTeamIccImpl(){
        System.out.println("no-arg const of IndianCricketTeamIccImpl");
    }
    @Override
    public void fairPlay() {
        System.out.println("Running fairPlay in IndianCricketTeamIccImpls");
    }
}
