package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Icc;

public class Bcci {
    Icc icc;
    public Bcci(Icc icc){
        System.out.println("icc-arg const of Bcci");
        this.icc = icc;
    }

    public void play(){
        System.out.println("Running play in Bcci");
        if(this.icc != null){
            icc.fairPlay();
        }
    }
}
