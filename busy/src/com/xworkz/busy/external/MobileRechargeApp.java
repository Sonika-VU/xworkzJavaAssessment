package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.RechargeService;

public class MobileRechargeApp {
    RechargeService rechargeService;

    public MobileRechargeApp(RechargeService rechargeService){
        this.rechargeService = rechargeService;
        System.out.println("rechargeService-arg const of MobileRechargeApp");
    }

    public void payAndRecharge(){
        System.out.println("Running payAndRecharge in MobileRechargeApp");
        if(this.rechargeService != null){
            this.rechargeService.recharge();
        }
    }
}
