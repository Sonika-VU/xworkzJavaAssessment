package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.BarcodeScanner;

public class RetailScanner implements BarcodeScanner {
    @Override
    public void scanItem() {
        System.out.println("Running scanItem in RetailScanner");
    }

    @Override
    public void resetScanner() {
        System.out.println("Running resetScanner in RetailScanner");
    }

    @Override
    public void calibrate() {
        System.out.println("Running calibrate in RetailScanner");
    }
}
