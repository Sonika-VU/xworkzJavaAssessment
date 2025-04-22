package com.xworkz.busy.runner;

import com.xworkz.busy.external.BillingCounter;
import com.xworkz.busy.internal.implementor.SupermarketBarcodeImpl;
import com.xworkz.busy.internal.rules.BarCodeScanner;

public class BarcodeRunner {
    public static void main(String[] args) {
        BarCodeScanner barCodeScanner = new SupermarketBarcodeImpl();
        BillingCounter billingCounter = new BillingCounter(barCodeScanner);

        billingCounter.getBill();
    }
}
