package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.BarCodeScanner;

public class BillingCounter {

    BarCodeScanner barCodeScanner;

    public BillingCounter(BarCodeScanner barCodeScanner){
        this.barCodeScanner = barCodeScanner;
        System.out.println("barCodeScanner-arg const of BillingCounter");
    }

    public void getBill(){
        System.out.println("Running getBill in BillingCounter");
        if(this.barCodeScanner != null){
            this.barCodeScanner.scan();
        }
    }
}
