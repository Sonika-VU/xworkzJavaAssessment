package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.BarCodeScanner;

public class SupermarketBarcodeImpl implements BarCodeScanner {

    public SupermarketBarcodeImpl(){
        System.out.println("no-arg const of SupermarketBarcodeImpl");
    }

    @Override
    public void scan() {
        System.out.println("Running scan in SupermarketBarcodeImpl");
    }
}
