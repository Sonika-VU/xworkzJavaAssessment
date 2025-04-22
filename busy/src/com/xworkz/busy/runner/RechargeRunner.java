package com.xworkz.busy.runner;

import com.xworkz.busy.external.MobileRechargeApp;
import com.xworkz.busy.internal.implementor.JioRechargeImpl;
import com.xworkz.busy.internal.rules.RechargeService;

public class RechargeRunner {
    public static void main(String[] args) {
        RechargeService rechargeService = new JioRechargeImpl();
        MobileRechargeApp mobileRechargeApp = new MobileRechargeApp(rechargeService);

        mobileRechargeApp.payAndRecharge();
    }
}
