package com.xworkz.busy.runner;

import com.xworkz.busy.external.Bcci;
import com.xworkz.busy.internal.implementor.IndianCricketTeamIccImpl;
import com.xworkz.busy.internal.rules.Icc;

public class IccRunner {
    public static void main(String[] args) {
        Icc icc = new IndianCricketTeamIccImpl();
        Bcci bcci = new Bcci(icc);
        bcci.play();
    }
}
