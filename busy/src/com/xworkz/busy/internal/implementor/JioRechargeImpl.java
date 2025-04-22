package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.RechargeService;

public class JioRechargeImpl implements RechargeService {
    public JioRechargeImpl(){
        System.out.println("no-arg const of JioRechargeImpl");
    }
    @Override
    public void recharge() {
        System.out.println("Running recharge in JioRechargeImpl");
    }
}
